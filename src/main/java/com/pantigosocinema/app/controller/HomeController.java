package com.pantigosocinema.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	//Peticion tipo get , si no se repondera a la peticion , respondera a cualquier
		//tipo de peticion
		
	@RequestMapping(value="/home" , method=RequestMethod.GET) 
	
	public String gohome() {
				
		return "home"; // -->El dispacherServlet buscara una vista llamada WEB-INF/views/home.jsp
	}
}
