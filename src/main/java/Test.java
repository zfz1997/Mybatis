import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import require.require1;
import require.require2;
import require.require3;

public class Test {
  public static void main(String[] args) throws IOException, InterruptedException {
      //System.out.println(StudentOperator.getInstance().selectStudentById(3));
      Reader reader=Resources.getResourceAsReader("config.xml");
      SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(reader);
      SqlSession ss = ssf.openSession();
      require1 one=new require1(ss);
      require2 two=new require2(ss);
      require3 three=new require3(ss);
      long t1=System.currentTimeMillis();
      for(int i=0;i<1000;i++) {
      one.run();
      two.run();
      three.run();
      }
      long t2=System.currentTimeMillis();
      System.out.println(t2-t1);
      /*long t1=System.currentTimeMillis();
      for(int i=0;i<1000;i++)
      {
    	 System.out.println(ss.selectOne("com.iotek.StudentMapper.selectStudentById", 1)); 
    	  Thread.sleep(10);
      }
      long t2=System.currentTimeMillis();
      System.out.println(t2-t1);*/
      
}
}
