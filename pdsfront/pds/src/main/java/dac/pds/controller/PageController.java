package dac.pds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping("/page")
	public ModelAndView index(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","HOME");
	mv.addObject("userClickHome","true");
	return mv;
	
	}
	
	
	@RequestMapping("/about")
	public ModelAndView about(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","ABOUT US");
	mv.addObject("userClickAbout","true");
	return mv;
	}
	
	
	@RequestMapping("/contact")
	public ModelAndView contact(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("title","CONTACT US");
	mv.addObject("userClickContact","true");
	return mv;
	}
}

