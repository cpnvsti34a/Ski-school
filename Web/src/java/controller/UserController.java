/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;
import service.UserService;

/**
 *
 * @author kevin.borgeaud
 */
public class UserController extends AbstractController {
    private UserService userService;
    private String users;
    
    public UserController() {
          
    }
    

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                ModelAndView mv = new ModelAndView("userView");
                mv.addObject("pass", userService.retour("http://localhost:3000/users/1.xml"));
                return mv;
    }
}
