package cn.edu.ken.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.ken.mybatis.mapper.ContactMapper;
import cn.edu.ken.mybatis.model.Contact;
import cn.edu.ken.mybatis.model.ContactExample;

@Component
public class ContactDao {

	@Autowired
	private SqlSession sqlSession;

	/**
	 * 
	 * @param contact
	 * @return if return value = 0 then login failed if return value = 1 then
	 *         login okay if return value > 1 then something wrong with
	 *         duplicated username or password
	 */
	public int login(Contact contact) {
		ContactExample example = new ContactExample();
		ContactExample.Criteria cri = example.createCriteria();
		cri.andUsernameEqualTo(contact.getUsername());
		cri.andPasswordEqualTo(contact.getPassword());
		ContactMapper vcontactMapper = sqlSession
				.getMapper(ContactMapper.class);
		int returnValue = vcontactMapper.countByExample(example);
		return returnValue;
	}

	// 模拟数据库操作
	public void addContact(Contact contact) {
		System.out.print("Add");
		ContactMapper vcontactMapper = sqlSession
				.getMapper(ContactMapper.class);
		vcontactMapper.insert(contact);
		sqlSession.commit();

	}

	public void updateContact(Contact contact) {
		System.out.print("Update");
		ContactMapper vcontactMapper = sqlSession
				.getMapper(ContactMapper.class);
		// 只更新不为空的字段，所以是可以有选择性的更新，只更新需要的
		vcontactMapper.updateByPrimaryKeySelective(contact);
	}

	public List<Contact> searchByExample(Contact contact) {
		System.out.println("searchByExampleContact");
		ContactExample example = new ContactExample();
		ContactExample.Criteria cri = example.createCriteria();
		System.out.println(contact.getUsername() + ":" + contact.getPassword());

		
		ContactMapper vcontactMapper = sqlSession
				.getMapper(ContactMapper.class);
		List<Contact> returnList = vcontactMapper.selectByExample(example);
		return returnList;
	}

	public List<Contact> searchList(Contact contact) {
		System.out.println("searchList");
		ContactExample example = new ContactExample();
		ContactExample.Criteria cri = example.createCriteria();
		ContactMapper vcontactMapper = sqlSession
				.getMapper(ContactMapper.class);

		List<Contact> returnList = vcontactMapper.selectByExample(example);
		return returnList;
	}
}
