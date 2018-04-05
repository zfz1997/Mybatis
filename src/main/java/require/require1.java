package require;

import org.apache.ibatis.session.SqlSession;

public class require1 implements Runnable{
       private SqlSession ss=null;
       public require1(SqlSession ss) {
    	    this.ss=ss;
       }
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(ss.selectOne("com.iotek.StudentMapper.selectStudentById", 1)); 
	}
    
}
