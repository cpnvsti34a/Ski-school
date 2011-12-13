/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.portlet.ModelAndView;
import service.PreOrderService;

/**
 *
 * @author johanna.vaney
 */
public class PreOrderController {
    private PreOrderService PreOrderService;

    public void setPreOrderService(PreOrderService PreOrderService) {
        this.PreOrderService = PreOrderService;
    }

    protected ModelAndView handleRequestInternal(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
                ModelAndView mv = new ModelAndView("preOrderView");
                System.out.print("hihi");
                //mv.addObject("pass", userService.retour("http://localhost:3000/users/1.xml"));
                //mv.addObject("pass", userService.create("id="+tab[0]));
                //mv.addObject("pass", PreOrderService.create(user.getAll()));
                return mv;
    }
}
