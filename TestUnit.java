package src.test.java.com.event;



import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;








import src.main.java.com.event.SimpleMath;
import src.main.java.com.event.UserRegistration;
import src.main.java.com.event.UserService;

public class TestUnit {

	@Test
	public void simpleMathAdd(){
		int a = 10;
		int b = 20;
		int expectedResult=30;
		SimpleMath math=new SimpleMath();
		Assert.assertNotNull(math.sum(a, b)); 
		Assert.assertEquals(expectedResult, math.sum(a, b));
	}
	@Test
	public void simpleMathsubs(){
		int a = 30;
		int b = 20;
		int expectedResult=10;
		SimpleMath math=new SimpleMath();
		
		Assert.assertNotNull(math.subtraction(a, b)); 
		Assert.assertEquals(expectedResult, math.subtraction(a, b));
	}
	@Test
	public void simpleMathMulti(){
		int a = 30;
		int b = 20;
		int expectedResult=600;
		SimpleMath math=new SimpleMath();
		
		Assert.assertNotNull(math.multiplication(a, b)); 
		Assert.assertEquals(expectedResult, math.multiplication(a, b));
	}
	@Test
	public void simpleMathDivi() throws Exception{
		int a = 30;
		int b = 5;
		int expectedResult=6;
		SimpleMath math=new SimpleMath();
		
		Assert.assertNotNull(math.divison(a, b)); 
		Assert.assertEquals(expectedResult, math.divison(a, b));
	}
	@Test
	public void simpleMathEqual() throws Exception{
		int a = 30;
		int b = 30;
		
		SimpleMath math=new SimpleMath();
		
		Assert.assertNotNull(math.equalIntegers(a, b)); 
		Assert.assertEquals(true, math.equalIntegers(a, b));
	}
	

	@Test
	public void userRegistration() throws Exception {
		 String name="Poritosh";
		 String email="poritosh.anand@cognizant.com";
		 int age=25;
		 UserRegistration user =new UserRegistration();
		
		 Assert.assertTrue(user.validateEmailAddress(email));
		Assert.assertTrue(user.validateAge(age));
		Assert.assertTrue(user.validateFirstName(name));
	}
	@Test
	public void userService() throws Exception {
		String name="Dori";
		List<String> ExpectRes = new ArrayList<String>();
		ExpectRes.add("DORI");
		UserService.values();
		Assert.assertNotNull(UserService.values()); 
	}
		
		
	}




