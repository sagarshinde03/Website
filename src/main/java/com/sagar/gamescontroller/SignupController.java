package com.sagar.gamescontroller;

/**
 * @author Sagar
 */

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sagar.model.User;
import com.sagar.model.UserStatus;
import com.sagar.model.UsersAndRoles;
import com.sagar.service.UserService;
import com.sagar.service.UsersAndRolesService;

@Controller
public class SignupController {
	@Autowired
	private UserService userService;
	@Autowired
	private UsersAndRolesService usersAndRolesService;
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	protected ModelAndView handleRequestInternal() {
		ModelAndView modelAndView = new ModelAndView("signup");
		return modelAndView;
	}
	@RequestMapping(value="/submitSignupDetails", method=RequestMethod.POST)
	protected ModelAndView submitSignupDetails(
			@RequestParam("confirmPassword") String confirmPassword,
			@Valid
			@ModelAttribute("user") User user,
			BindingResult result) {
		if(!user.getPassword().equals(confirmPassword)){
			ObjectError obj=new ObjectError(confirmPassword, "Confirm Password does not match with original password");
			result.addError(obj);
		}
		if(result.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("signup");
			return modelAndView;
		}
		user.setStatus(UserStatus.ACTIVE);
		try{
			userService.addUser(user);
			UsersAndRoles usersAndRoles=new UsersAndRoles(user.getUsername(), 2, user);
			usersAndRolesService.addUsersAndRoles(usersAndRoles);
		}catch(DataIntegrityViolationException e){
			ObjectError obj=new ObjectError(user.getUsername(), "This Email Address is already registered.");
			result.addError(obj);
		}
		if(result.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("signup");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("signup-success");
		return modelAndView;
	}
}