package cn.edu.ken.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ken.mybatis.model.Contact;
//import cn.edu.ken.model.Contact;
import cn.edu.ken.service.ContactService;

@Controller
@RequestMapping("/contact")
public class ContactController {
	@Resource(name = "contactService")
	private ContactService contactService;

	@RequestMapping("/login")
	public String login(Contact contact, Model model, HttpServletRequest request) {
		int rvLogin = contactService.loginService(contact);
		if (rvLogin == 1) {
			return "users/success";
		} else {
			return "users/failed";
		}
	}

}