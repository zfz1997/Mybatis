package require;

import org.apache.ibatis.session.SqlSession;

public class require3 implements Runnable {
     public SqlSession ss=null;
     public require3(SqlSession ss) {
    	 this.ss=ss;
     }
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(ss.selectOne("com.iotek.StudentMapper.selectStudentById", 3)); 
	}

}
