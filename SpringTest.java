package springExample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringTest {
	public static void main(String[] args) { 
		
		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		SpringBean sBean = (SpringBean)factory.getBean("SpringBean");
		
		sBean.display();
	}
}
