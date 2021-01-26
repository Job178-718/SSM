package spring;

import com.sun.service.AccountSevice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    /**
     *
     */
    @Test
    public void findAll(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountSevice as = app.getBean(AccountSevice.class);
        as.finaAll();
    }

}
