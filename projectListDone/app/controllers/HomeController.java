package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private FormFactory formFactory;
    
        @Inject
        public HomeController(FormFactory f) {
            this.formFactory = f;
        }
    
        public Result index(Long cat) {
            List<Projects> projectsList = null;
            List<Department> departmentList = Department.findAll();
            if (cat == 0) {
                projectsList = Projects.findAll();
            }
            else {
                projectsList = Department.find.ref(cat).getProjects();
            }
            return ok(index.render(projectsList, departmentList, User.getUserById(session().get("email"))));
        }

    public Result employee() {
        List<Employee> employeeList = Employee.findAll();
        return ok(employee.render(employeeList,User.getUserById(session().get("email"))));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    public Result addProjects() {
        Form<Projects> projectsForm = formFactory.form(Projects.class);
        return ok(addProjects.render(projectsForm, User.getUserById(session().get("email"))));
    }
    public Result addProjectsSubmit() {
        Form<Projects> newProjectsForm = formFactory.form(Projects.class).bindFromRequest();

        if (newProjectsForm.hasErrors()) {
            return badRequest(addProjects.render(newProjectsForm, User.getUserById(session().get("email"))));
        }
        else {
            Projects newProjects = newProjectsForm.get();

            if (newProjects.getId() == null) {
                newProjects.save();    
                flash("success", "Projects " + newProjects.getName() + " was added");
                
            }
            else if (newProjects.getId() != null) {
                newProjects.update();
                flash("success", "Projects " + newProjects.getName() + " was updated");
            }
        }

        return redirect(controllers.routes.HomeController.index(0));
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result addEmployee() {
        Form<Employee> employeeForm = formFactory.form(Employee.class);
        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
    }

    public Result addEmployeeSubmit() {
        Form<Employee> newEmployeeForm = formFactory.form(Employee.class).bindFromRequest();
        

        if (newEmployeeForm.hasErrors()) {
            return badRequest(addEmployee.render(newEmployeeForm,User.getUserById(session().get("email"))));
            
        } 
        else {
            Employee newEmployee = newEmployeeForm.get();
            
            if (newEmployee.getId() == null) {
                newEmployee.save();
                flash("success", "Employee " + newEmployee.getName() + " was added");                
            }

            else {
                newEmployee.update();
                flash("success", "Employee " + newEmployee.getName() + " was updated");                
            }



            return redirect(controllers.routes.HomeController.employee());
        }
    }
    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result deleteProjects(Long id) {
        Projects.find.ref(id).delete();

        flash("success", "Projects has been deleted");
        
        return redirect(routes.HomeController.index(0));
    }
    public Result deleteEmployee(Long id) {
        Employee.find.ref(id).delete();
        flash("success", "Employee has been deleted");

        return redirect(routes.HomeController.index(0));
    }

    @Security.Authenticated(Secured.class)
    @With(AuthAdmin.class)
    @Transactional
    public Result updateProjects(Long id) {
        Projects p;
        Form<Projects> projectsForm;

        try {
            p = Projects.find.byId(id);
            projectsForm = formFactory.form(Projects.class).fill(p);
        } 
        catch (Exception ex) {
            return badRequest("error");
        }
        return ok(addProjects.render(projectsForm,User.getUserById(session().get("email"))));
    }
    @Transactional
    public Result updateEmployee(Long id) {        
        Employee e;
        Form<Employee> employeeForm;

        try {
            e = Employee.find.byId(id);
            employeeForm = formFactory.form(Employee.class).fill(e);
        }
        catch (Exception ex) {
            return badRequest("error");
        }

        return ok(addEmployee.render(employeeForm,User.getUserById(session().get("email"))));
    }

}
