package cn.edu.ken.commons.dao;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import cn.edu.ken.mybatis.model.Contact;

public class BaseDao {
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

	public static void main(String[] args) {
		BaseDao dao = new BaseDao();
		Contact contact = new Contact();
		// contact.setUsername("");
		System.out.println(dao.objectAttrNullCheck(contact, "username"));
	}

}
