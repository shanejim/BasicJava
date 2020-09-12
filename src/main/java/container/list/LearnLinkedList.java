package container.list;

import entity.Student;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String args[]) {
        LinkedList<Student> studentList = new LinkedList();

        Student studentA = new Student();
        studentA.setAge(18);
        studentA.setName("Jack");
        Student studentB = new Student();
        studentB.setAge(19);
        studentB.setName("Mike");
        studentList.add(studentB);

        System.out.println(studentList.get(0).toString());

        Student studentC = new Student();
        studentC.setAge(19);
        studentC.setName("Mike");
        studentList.addFirst(studentC);

    }
}
