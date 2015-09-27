package cn.edu.ken.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping("/add")
	public String add(Contact contact) {
		contactService.addContact(contact);
		return "users/search";
	}

	@RequestMapping(value = "/preupdate/{idcontact}", method = RequestMethod.GET)
	public String preupdate(
			@PathVariable(value = "idcontact") Integer idcontact, Model model) {
		System.out.println("=======" + idcontact);
		Contact contact = contactService.searchById(idcontact);
		if (contact != null)
			model.addAttribute("contact", contact);
		return "users/update";
	}

	@RequestMapping("/update")
	public String update(Contact contact) {
		contactService.updateContact(contact);
		return "users/search";
	}

	/**
	 * 添加或者更新以后进行查询
	 * 
	 * @param contact
	 * @param model
	 * @return
	 */
	@RequestMapping("/addsearch")
	public String addSearch(Contact contact, Model model) {
		contactService.addContact(contact);
		List<Contact> contacts = contactService.searchByContact(contact);
		model.addAttribute("contacts", contacts);
		return "users/search";
	}

	@RequestMapping("/search")
	public String searchByCondition(Contact contact, Model model) {
		List<Contact> contacts = contactService.searchByCondition(contact);
		model.addAttribute("contacts", contacts);
		contact = null;
		return "users/search";
	}

}