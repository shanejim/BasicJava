package database;

import entity.Student;
import mapper.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisDemo {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(22);
        student.setGrade(22);
        student.setName("test");

        SqlSession openSession = null;
        try {
            InputStream inputStream = Resources.getResourceAsStream("config/mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            openSession = factory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
        }

        StudentMapper studentMapper = openSession.getMapper(StudentMapper.class);
        studentMapper.insertStudent(student);
//        studentMapper.deleteAllStudent();
        openSession.commit();
    }

}
