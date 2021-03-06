package spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.intarfaces.Lyricist;

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Lyricist lyr1 = context.getBean("LyricistBean1", Lyricist.class);
		System.out.println(lyr1.Generate());

		((ConfigurableApplicationContext) context).close();// закрытие контекста вручную

	}

}
