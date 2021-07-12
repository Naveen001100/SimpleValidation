package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AddController {
	@RequestMapping("/validate")
	public ModelAndView add(@RequestParam("input1") String name,@RequestParam("input2") String pwd) {		
		String k;
		LoginInformation  l = new LoginInformation();

		if(l.validate(name, pwd))
		{
			k = "Success";
		}
		else
		{
			k = "Failed";
		}
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Display.jsp");
		mv.addObject("result",k);
		
		return mv;
	}		
}
