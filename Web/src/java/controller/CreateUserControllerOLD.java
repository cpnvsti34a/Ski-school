/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.UserService;

/** 
 *
 * @author Lionel.MARMIER
 */
public class CreateUserControllerOLD extends SimpleFormController {
    
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public CreateUserControllerOLD() {
        //Initialize controller properties here or 
        //in the Web Application Context
        System.out.print("ça marche pas !!!");

        setCommandClass(User.class);
        setCommandName("user");
        setSuccessView("userView");
        setFormView("CreateUser");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    //*
    protected ModelAndView onSubmit(
    HttpServletRequest request, 
    HttpServletResponse response, 
    Object command, 
    BindException errors) throws Exception {
        System.out.print(errors + "test");
        ModelAndView mv = new ModelAndView(getSuccessView());
        User user = (User) command;
        mv.addObject("utilisateur", userService.create(user.getAll()));
        mv.addObject("test", "Test");
        return mv;
    }
    // */
}
