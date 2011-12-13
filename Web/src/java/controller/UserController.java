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
    private User user;

    private String[] tab = new String[2];
        
      public UserController() {
          user = new User();
          user.setName("Lionel");
          user.setAddress("Chemin du clos aux oies 4");
          user.setCity("Orzens");
          user.setCountry("Switzerland");
          user.setLastName("Marmier");
          user.setPassword("1234");
          user.setUserName("Lion.mar");
          user.setZip(1413);
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
<<<<<<< HEAD
                mv.addObject("pass", userService.create("data"));
=======
                //mv.addObject("pass", userService.create("id="+tab[0]));
                mv.addObject("pass", userService.create(user.getAll()));
>>>>>>> 5693524e46cac565afeeeac23a7e10946a7856fa
                return mv;
    }
    
    
}
