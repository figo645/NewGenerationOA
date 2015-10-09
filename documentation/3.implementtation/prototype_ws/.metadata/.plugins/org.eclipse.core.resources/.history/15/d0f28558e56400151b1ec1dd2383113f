package cn.edu.ken.commons.json;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import net.sf.json.JSONObject;
import net.sf.json.xml.XMLSerializer;
import cn.edu.ken.model.Book;
//import cn.edu.ken.model.Contact;
import junit.framework.Assert;
import junit.framework.TestCase;

public class JSONTestUnit extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	@Test
	public void testJSONObject001() {
		JSONObject jsonObject = JSONObject.fromObject(new Book());
		System.out.println("testJSONObject001:"+jsonObject);
		Assert.assertFalse("".equals(jsonObject.toString()));
	}

	@Test
	public void testJSONObjectToXMLTest002() {
		JSONObject jsonObject = JSONObject.fromObject(new Book());
		try {
			XMLSerializer xml = new XMLSerializer();
			String xmlStr = xml.write(jsonObject);
			System.out.println("testJSONObjectToXMLTest002:"+xmlStr);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	@Test
//	public void testJSONJacksonTest003() throws JsonParseException, JsonMappingException, IOException {
//		String s = "{\"name\":123}";       
//        ObjectMapper mapper = new ObjectMapper();  
//        //unmarshalling (reading JSON)    
//        Contact a = mapper.readValue(s, Contact.class);          
//        //marshalling (reading JSON)  
//        //{"name":123}  
//        System.out.println("testJSONJacksonTest003:"+mapper.writeValueAsString(a));  
//	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
