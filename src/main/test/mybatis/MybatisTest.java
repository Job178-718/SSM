package mybatis;

import com.sun.dao.AccountDao;
import com.sun.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.jupiter.api.DynamicTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void Test1() throws IOException {
        //1.将mybatis.xml文件加载到内存；
        InputStream input = Resources.getResourceAsStream("myBatis.xml");
        //2.将数据库工厂创建
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(input);
        //3.获取一条数据库
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4.执行sql语句
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        //5.获取数据
        List<Account> accounts = mapper.findAll();
        for(Account account:accounts){
            System.out.println(account);
        }
        sqlSession.close();
    }
}
