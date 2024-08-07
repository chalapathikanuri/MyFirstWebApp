package com.firstwebapp.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String SayHelloController() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello2html")
	@ResponseBody
	public String SayHelloController1() {
		StringBuffer sb= new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>Yahoo!!</title>");		
		sb.append("</head>");
		sb.append("<body>");
		sb.append("My First JSP!!!");
		sb.append("</body>");
		sb.append("</html>");
		
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello2jsp")
	public String SayHelloJsp() {
		return "sayHello";
	}

}
