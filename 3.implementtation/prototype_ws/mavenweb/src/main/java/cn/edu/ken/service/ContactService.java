package cn.edu.ken.service;

import java.util.List;

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

	public void addContact(Contact contact) {
		// contact.setIdcontact(1);
		contact.setContacttypeIdcontacttype(1);
		contact.setDepartmentIddepartment(1);
		contactDao.addContact(contact);
	}

	public Contact searchById(int id) {
		Contact contact = new Contact();
		contact.setIdcontact(id);
		List<Contact> onlyContact = contactDao.searchByExample(contact);
		return onlyContact.get(0);
	}

	public void updateContact(Contact contact) {
		contactDao.updateContact(contact);
	}

	public List<Contact> searchByContact(Contact contact) {
		return contactDao.searchList(contact);
	}

	public List<Contact> searchByCondition(Contact contact) {
		return contactDao.searchByExample(contact);
	}
	
	public int retireContact(Contact contact){
		return contactDao.retire(contact);
	}
	
	public int deleteContact(Contact contact){
		return contactDao.delete(contact);
	}

}