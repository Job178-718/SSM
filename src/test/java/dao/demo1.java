package dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import java.util.List;

import tool.BaseTest;

public class demo1 extends BaseTest{

	@Autowired
	private AccountDao accountDao;
	
  @Test
  public void addUser() {
    accountDao.add(6, "孟子","SYZ123"); 
  }
	
	@Test
	public void query() {
		Account user = accountDao.query(4);
		System.out.println("id="+user.getId()+",user="
		+user.getUser()+",password="
				+user.getPassword());
	}
	
	@Test
	public void delete() {
		Integer in = accountDao.delete(3);
	    System.out.println(in);
	}
	
	@Test
	public void getid() {
		Account account = new Account();
		account.setUser("liu");
		List<Integer> accountInteger = accountDao.getId(account);
		for(Integer account1:accountInteger) {
        	System.out.println(account1);
        }
	}
	
	
}
