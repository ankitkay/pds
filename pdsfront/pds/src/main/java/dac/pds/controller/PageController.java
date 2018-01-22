package dac.pds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping("/page")
	public ModelAndView index(){
	ModelAndView mv = new ModelAndView("page");
	mv.addObject("greeting","welcome");
	return mv;
	//return new ModelAndView("page","msg","Hello First Spring");
	}
}

