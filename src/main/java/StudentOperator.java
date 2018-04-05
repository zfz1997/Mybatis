import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.iotek.entity.Student;

public class StudentOperator 
{
    private static StudentOperator instance = new StudentOperator();
    
    protected static SqlSessionFactory ssf;
    protected static Reader reader;
    
    static
    {
        try
        {
            reader = Resources.getResourceAsReader("config.xml");
            ssf = new SqlSessionFactoryBuilder().build(reader);
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private StudentOperator()
    {
        
    }
    
    public static StudentOperator getInstance()
    {
        return instance;
    }
    
    public Student selectStudentById(int studentId)
    {
        SqlSession ss = ssf.openSession();
        Student student = null;
        try
        {
            student = ss.selectOne("com.iotek.StudentMapper.selectStudentById", studentId);
        }
        finally
        {
            ss.close();
        }
        return student;
    }
}
