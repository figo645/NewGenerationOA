package cn.edu.ken.business.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import cn.edu.ken.business.dao.ContactDao;
import cn.edu.ken.mybatis.model.Contact;

@Component
public class ContactService {
	@Resource
	private ContactDao contactDao;

	public int loginService(Contact contact) {
		int returnValue = contactDao.login(contact);
		return returnValue;
	}

	public void addContact(Contact contact) {
		// contact.setIdcontact(1);
		contact.setContacttypeIdcontacttype(1);
		contact.setDepartmentIddepartment(1);
		contactDao.insert(contact);
	}

	public Contact searchById(int id) {
		Contact contact = (Contact)contactDao.findById(id);
		return contact;
	}

	public void updateContact(Contact contact) {
		contactDao.update(contact);
	}

	public List<Contact> searchByContact(Contact contact) {
		return contactDao.findAll();
	}

	public List<Contact> searchByCondition(Contact contact) {
		return contactDao.searchByExample(contact);
	}

	public int retireContact(int id) {
		return contactDao.retireById(id);
	}

	public int deleteContact(int id) {
		return contactDao.deleteById(id);
	}

}