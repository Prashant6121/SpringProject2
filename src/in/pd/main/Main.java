package in.pd.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.pd.beans.Student;
import in.pd.resources.SpringConfigFile;

public class Main {

	public static void main(String[] args) {

		
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
		Student st=(Student)context.getBean(Student.class);
		st.display();
		System.out.println("Hey guy's");
	}

}
