package cn.edu.ken.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ken.model.Book;
import cn.edu.ken.mybatis.mapper.contactMapper;
import cn.edu.ken.mybatis.model.contactExample;
import cn.edu.ken.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
	@Resource(name = "bookService")
	private BookService bookService;
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("/update")
	public String update(Book book, Model model,HttpServletRequest request) {
		//System.out.println("service update");
		model.addAttribute("greetings", "I came from Model not ModelAttribute"); 
		//System.out.println(model.toString());
		request.setAttribute("hello", "request hello");
		//SqlSession session = sqlSessionFactory.openSession();
		
		contactExample example = new contactExample();
		contactExample.Criteria cri = example.createCriteria();
		cri.andIdEqualTo(1);
		cri.andContactnameLike("na%");
		contactMapper vcontactMapper = sqlSession.getMapper(contactMapper.class);
		int c = vcontactMapper.countByExample(example);
		System.out.println(c);
		model.addAttribute("book",book);
		return "users/success";
	}

}