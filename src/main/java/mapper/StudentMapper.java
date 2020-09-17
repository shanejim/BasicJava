package mapper;

import entity.Student;

public interface StudentMapper {
    public int deleteAllStudent();

    public boolean insertStudent(Student student);
}
