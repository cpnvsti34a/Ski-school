/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import service.UserService;

/**
 *
 * @author Lionel.MARMIER
 */
public class UserController extends AbstractController {
    
    private UserService userService;

    private String[] tab = new String[2];
        
      public UserController() {
          tab[0] = "1234";
          tab[1] = "nom d'utilisateur";
       
    }
    

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                ModelAndView mv = new ModelAndView("userView");
                //mv.addObject("pass", userService.retour("http://localhost:3000/users/1.xml"));
                //mv.addObject("pass", userService.create("id="+tab[0]));
                mv.addObject("pass", userService.create("name="+tab[1]+"&id="+tab[0]));
                return mv;
    }
    
    
}
