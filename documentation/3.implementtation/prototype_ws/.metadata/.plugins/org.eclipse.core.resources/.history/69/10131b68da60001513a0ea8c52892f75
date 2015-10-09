package cn.edu.ken.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.ken.dao.ContactDao;
import cn.edu.ken.mybatis.model.Contact;

@Component
public class ContactService {
	@Resource
	private ContactDao contactDao;

	public int loginService(Contact contact) {
		int returnValue = contactDao.login(contact);
		return returnValue;
	}

}