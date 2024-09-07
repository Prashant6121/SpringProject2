package in.pd.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.pd.beans.Address;
import in.pd.beans.Student;

@Configuration
public class SpringConfigFile {
		
	@Bean
	public Student stdid()
	{
		Student std=new Student();
		std.setId(101);
		std.setName("Prashant");
		std.setAddress(addres());
		return std;
	}
	
	@Bean
	public Address addres()
	{
		Address addr=new Address();
		addr.setHouseno(111);
		addr.setCity("Pune");
		addr.setPincode(412105);
		return addr;
		
	}
	
	
	
	

}
