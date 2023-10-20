package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.User;
import com.service.UserService;

@Controller
public class SimpleLoginAuthenticationSystem {

	@Autowired
	private UserService service;

	@RequestMapping(value = "/")
	public String homePageCalled() {

		return "index";
	}

	@RequestMapping(value = "/log")
	public String loginCredential(@RequestParam String username, @RequestParam String password, Model m) {

		if (username.equals("Admin") && password.equals("admin@123")) {
			System.out.println("Login Credentials : " + username + "    " + password);

			List<User> ulist = service.getUsers();
			m.addAttribute("ulist", ulist);
			return "details";
		} else {
			m.addAttribute("msg", "You have entered wrong Credentials, Try again...");
			return "warning";
		}
	}

	@RequestMapping(value = "/reg")
	public String registerDetails(@ModelAttribute User user, Model m) {

		service.registerUser(user);

		return "success";
	}

	@RequestMapping(value = "edit")
	public String editAction(@RequestParam int id, Model m) {

		User u = service.getSingleUser(id);
		m.addAttribute("user", u);
		return "edit";
	}


	@RequestMapping(value = "up")
	public String updateAction(@ModelAttribute User u) {

		service.updateData(u);
		return "index";
	}

	@RequestMapping(value = "del")
	public String deleteAction(@RequestParam int id, Model m) {

		service.delUser(id);

		return "index";
	}

}