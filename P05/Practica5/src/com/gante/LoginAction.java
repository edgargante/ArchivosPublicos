package com.gante;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.gante.LoginForm;

public class LoginAction extends Action {
	
	    @Override
	    public ActionForward execute(ActionMapping mapping, ActionForm form,
	            HttpServletRequest request, HttpServletResponse response)
	            throws Exception {
	        LoginForm loginForm = (LoginForm) form;
	 
	        if (loginForm.getUserName().equalsIgnoreCase("admin") && loginForm.getPassword().equals("admin")) {
	            return mapping.findForward("success");
	        } else
	            return mapping.findForward("failure");
	    }

}
