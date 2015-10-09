package cn.edu.ken.commons.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import cn.edu.ken.mybatis.model.Contact;

public abstract class BaseDao implements IBaseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	protected boolean objectAttrNullCheck(Object object, String attributeName) {
		boolean returnValue = false;
		Class classz = object.getClass();
		String attrNameStart = attributeName.substring(0, 1).toUpperCase();
		String attrNameEnd = attributeName.substring(1, attributeName.length());
		String attr = attrNameStart + attrNameEnd;

		String methodName = new StringBuffer("get").append(attr).toString();
		try {
			Method method = classz.getMethod(methodName, null);
			Object newObj = method.invoke(object, null);
			if (newObj != null && !newObj.toString().equals("")) {
				returnValue = true;
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnValue;
	}

	protected int executeSQL(String sql, Map keyValue) {
		// TODO Auto-generated method stub
		return 0;
	}

	protected int querySQL(String sql, Map keyValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}