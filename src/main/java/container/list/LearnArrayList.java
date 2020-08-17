package container.list;

import entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shanejim
 * @description todo
 * @date 2018/10/25
 */
public class LearnArrayList {

    public static void main(String args[]) {
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

        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

        //Output : A,B,C,D,E
        for (String item : items) {
            System.out.println(item);
        }
        //lambda in java 8
        items.forEach(item -> {
            System.out.println(item);
        });
    }
}
