package springApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springApp.controller.Client.User;
import springApp.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService usrService;
	
	//for Common properties
	@ModelAttribute
	public void commonHandler(Model model) {
		
		
	}
	
	@RequestMapping("/home")
	public String formPage(Model model) {
		System.out.println("Hello , Form Page");
		model.addAttribute("Header", "currently under Process");		
		return "form";
	}

/*	@RequestMapping(path="/form1" , method= RequestMethod.POST)
	public String formHandler(Model model,
			@RequestParam("userName") String userName,
			@RequestParam("emailaddress")  String email,
			@RequestParam("passwd") String passwd      ) {
		
		System.out.println("success");
		System.out.println(userName+"  "+email+ "  "+passwd);
		model.addAttribute("userName", userName);
		model.addAttribute("email", email);
		model.addAttribute("pass", passwd);
		
		return "success";
	}
*/
	
	@RequestMapping(path="/form1", method=RequestMethod.POST)
	public String formHandler(@ModelAttribute User user) {
		
		this.usrService.createUSer(user);
		return "success";
	}
	
	
}

