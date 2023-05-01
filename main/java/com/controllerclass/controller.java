package com.controllerclass;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.dao;
import com.modelclass.model;

@Controller
public class controller {
	@Autowired
	private dao dao;

	@RequestMapping("/about")
	public String about(HttpServletRequest request) {

		return "about";
	}

	@RequestMapping("/")
	public String about2(Model m) {

		List<model> list = dao.getAllUser();
		m.addAttribute("list", list);
		return "index";
	}

	@RequestMapping("/home")
	public String home(HttpServletRequest request) {

		return "home";
	}

	@RequestMapping(value = "/adduser", method = RequestMethod.POST)
	public RedirectView addUser(@ModelAttribute model m, HttpServletRequest request) {
		System.out.println(m);
		dao.insertuser(m);

		RedirectView view = new RedirectView();
		view.setUrl(request.getContextPath() + "/login");
		return view;
	}

	@RequestMapping("/login" )
	public ModelAndView showlogin (HttpServletRequest request , HttpServletResponse response)) {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("login" ,  new model());
		return mav;
	}

	@RequestMapping ("/loginuser" )
	public ModelAndView loginuser (HttpServletRequest request , HttpServletResponse response ,  @ModelAttribute("login") model login)
	
	ModelAndView mav = null;

	
	
}
