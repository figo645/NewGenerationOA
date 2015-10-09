package cn.edu.ken.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.edu.ken.model.Book;
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
	 * @return if return value = 0 then login failed 
	 * 			if return value = 1 then
	 *         			login okay 
	 *          if return value > 1 then 
	 *          	something wrong with
	 *         		duplicated username or password
	 */
	public int login(Contact contact) {
		ContactExample example = new ContactExample();
		ContactExample.Criteria cri = example.createCriteria();
		cri.andUsernameEqualTo(contact.getUsername());
		cri.andPasswordEqualTo(contact.getPassword());
		ContactMapper vcontactMapper = sqlSession.getMapper(ContactMapper.class);
		int returnValue = vcontactMapper.countByExample(example);
		return returnValue;
	}

	// 模拟数据库操作
	public void add(Contact contact) {
		System.out.print("Add");
		
	}

	public void update(Contact contact) {
		System.out.print("Update");
	}
}
