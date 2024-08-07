package com.firstwebapp.myfirstwebapp.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
//	@Autowired
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String goToLoginPage( ) {
	//	model.put("name", name);
	//	logger.info("I want this printed at info level");
	//	logger.warn("I want this printed at warn level");
		//System.out.println("Request Param name ="+name);
		return "login";

}
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String showWelcomePage(@RequestParam String name, @RequestParam String password , ModelMap model ) {
		
		if (authenticationService.authenticate(name, password)) {
		model.put("name",name);
		model.put("password",password);
		return "welcome";
}
		model.put("errorMessage", "Invalid Credentials!!! plzz check");
		return "login";
}
}