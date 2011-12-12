/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.BindException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import service.UserService;

/** 
 *
 * @author Lionel.MARMIER
 */

/*
@RequestMapping("/createusers/**")
@Controller
public class CreateUserController {
    
    @RequestMapping(value = "/createuser", method = RequestMethod.POST)
    public String create(@ModelAttribute("user") final User user){
        if(user == null){
            throw new IllegalArgumentException("Aucun utilisateur n'as été créer...");
        }
        return "redirect:/user.html";
    }
    
 */
    
    public class CreateUserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public CreateUserController() {
        //Initialize controller properties here or 
        //in the Web Application Context
        System.out.print("ça marche pas !!!");

    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    protected ModelAndView onSubmit(
    HttpServletRequest request, 
    HttpServletResponse response, 
    Object command, 
    BindException errors) throws Exception {
        System.out.print(errors + "test");
        ModelAndView mv = new ModelAndView("userView");
        User user = (User) command;
        mv.addObject("utilisateur", userService.create(user.getAll()));
        mv.addObject("test", "Test");
        return mv;
    }
}