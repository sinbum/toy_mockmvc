package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.MockMvcService;


@SpringBootApplication
@Controller
//@ComponentScans("controller,dao,service")
//@ComponentScan("com.example*")
public class MockmvcApplication {
	
	@Autowired
	MockMvcService mockMvcService;
	

	public static void main(String[] args) {
		SpringApplication.run(MockmvcApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		//System.out.println(ds);
		//System.out.println(mockMvcService.insert("idtest", "passwordtest"));
		model.addAttribute("result", mockMvcService.insert("idtest", "passwordtest"));
		return "WEB-INF/view/index.jsp";
	}

}
