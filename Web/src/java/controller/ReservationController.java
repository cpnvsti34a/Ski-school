/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import service.ReservationService;
import service.UserService;

/**
 *
 * @author gregory.torche
 */
public class ReservationController extends AbstractMethodError {
    private ReservationService reservationService;
    private Reservation reservation;

    
        
      public ReservationController() {
     
    }
    

    public void setUserService(UserService userService) {
        this.reservationService = reservationService;
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                ModelAndView mv = new ModelAndView("userView");
                //mv.addObject("pass", userService.retour("http://localhost:3000/users/1.xml"));
                //mv.addObject("pass", userService.create("id="+tab[0]));
                mv.addObject("pass", reservationService.create(reservation.getAll()));
                return mv;
    }
    
}
