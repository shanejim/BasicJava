package javabasic.util.collection.list;

import javabasic.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shanejim
 * @description todo
 * @date 2018/10/25
 */
public class LearnArrayList {

    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        List strList = new ArrayList<String>();

        strList.add("asds");

        System.out.println(strList.size());


        List<Student> studentList = new ArrayList<>();
        Student studentA = new Student();
        studentA.setAge(18);
        studentA.setName("Jack");
        Student studentB = new Student();
        studentB.setAge(19);
        studentB.setName("Mike");
        studentList.add(studentB);



    }
}
