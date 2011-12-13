/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


/**
 *
 * @author gregory.torche
 */
public class ReservationController extends MultiActionController{
    
    
    public ModelAndView add(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
 
		return new ModelAndView("testpage", "msg","add() method");
	}
    
}



