package tests;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class samplelabda {

	@Test
	public void testmthod()
	{
		Map<Integer, Student> ItemToPrice = new HashMap<Integer, Student>(); 
		Student s1=new Student(1, "Arpit", "M", 19);
		Student s2=new Student(2, "John", "M", 17);
		Student s3=new Student(3, "Mary", "F", 14);
		Student s4=new Student(4, "Martin", "M", 21);
		Student s5=new Student(5, "Monica", "F", 16);
		Student s6=new Student(6, "Ally", "F", 20);
		ItemToPrice.put(1, s1);
		ItemToPrice.put(2, s2);
		ItemToPrice.put(3, s3);
		ItemToPrice.put(4, s4);
		ItemToPrice.put(5, s5);
		ItemToPrice.put(6, s6);

		
		
		System.out.println(ItemToPrice);
		Map<Integer, Student> upd = new HashMap<Integer, Student>(); 
				
		ItemToPrice.entrySet().stream()
				.filter(stu -> stu.getValue().getName().equals("John"))
				.forEach(c -> upd.put(c.getKey(), c.getValue()));
		
		System.out.println(upd);

	}

}
