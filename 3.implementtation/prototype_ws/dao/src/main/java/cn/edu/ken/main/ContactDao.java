package cn.edu.ken.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.edu.ken.dao.contactMapper;
import cn.edu.ken.model.contact;
import cn.edu.ken.model.contactExample;
import cn.edu.ken.model.contactExample.Criteria;

public class ContactDao {
	private SqlSession session =null;
	private contactMapper vcontactMapper = null;  
	public void testDaoInsert(){
		session = initSession();  
		vcontactMapper = session.getMapper(contactMapper.class);
		contact c = new contact();
		c.setId(1);
		c.setAge(10);
		c.setContactname("name");
		vcontactMapper.insert(c);
		session.commit();  
        session.close();
	}
	
	public void testDaoUpdate(){
		session = initSession();  
		vcontactMapper = session.getMapper(contactMapper.class);
		contact c = new contact();
		c.setId(1);
		c.setAge(12);
		//c.setContactname("name");
		//vcontactMapper.insert(c);
		
		vcontactMapper.updateByPrimaryKeySelective(c);
		session.commit();  
        session.close();
	}
	
	public void testDaoselectByid(){
		session = initSession();  
		vcontactMapper = session.getMapper(contactMapper.class);
		contact c = new contact();
		c.setId(1);
		c.setAge(11);
		c.setContactname("name");
		//vcontactMapper.insert(c);
		contact con = vcontactMapper.selectByPrimaryKey(1);
		System.out.println(con.getContactname());
		session.commit();  
        session.close();
	}
	
	public void testDaoselectByIdandName(){
		session = initSession();  
		vcontactMapper = session.getMapper(contactMapper.class);
		contact c = new contact();
		c.setId(1);
		c.setAge(11);
		c.setContactname("name");
		//vcontactMapper.insert(c);
		contactExample example = new contactExample();
		contactExample.Criteria cri = example.createCriteria();
		cri.andIdEqualTo(1);
		cri.andContactnameLike("na%");
		//List<contact> cons = vcontactMapper.selectByExample(example);
		int count = vcontactMapper.countByExample(example);
		System.out.println(count);
		session.commit();  
        session.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactDao dao = new ContactDao();
		//dao.testDaoInsert();
		//dao.testDaoUpdate();
		//dao.testDaoselectByid();
		dao.testDaoselectByIdandName();
	}	
	
	private SqlSession initSession(){
        //获取配置文件的输入流     
        Reader reader;
        try {  
        	reader = Resources.getResourceAsReader("cn/edu/ken/main/mybatis-config.xml");  
            //获取我们的SqlSessionFactory（相当于Hibernate的SessionFactory）；SqlSessionFactoryBuilder有点类似于Hibernate的Configuration。    
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);    
            //获取一个Session    
            return sqlSessionFactory.openSession();
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return null;  
    }  
}
