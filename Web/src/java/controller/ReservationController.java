/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import service.ReservationService;


/**
 *
 * @author gregory.torche
 */
public class ReservationController extends MultiActionController{
    
    private ReservationService reservationService;
    private Reservation reservation;
       
  /*    public ReservationController() {
          reservation = new Reservation();
    }
    

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    //@Override
    protected ModelAndView add(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                ModelAndView mv = new ModelAndView();
                mv.setViewName("reservation");
                //mv.addObject("pass", userService.retour("http://localhost:3000/users/1.xml"));
                //mv.addObject("pass", userService.create("id="+tab[0]));
                mv.addObject("pass", "teteteiotj");
                //mv.addObject("pass", reservationService.create(reservation.getAll()));
                return mv;
    }*/
    public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		return new ModelAndView("reservation", "msg","add() method");
	}
    
}
