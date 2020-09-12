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

        items.add(2, "HH");
        items.set(1, "AS");
        System.out.println(items.size());

        //Output : A,B,C,D,E
        for (String item : items) {
            System.out.println(item);
        }
        //lambda in java 8
        items.forEach(item -> {
            System.out.println(item);
        });

        //交集 并集 差集 去重复并集    如果是对象比较，需要重写GetHashCode()与Equals(object obj)
        List<String> charAList = new ArrayList<>();
        List<String> charBList = new ArrayList<>();
        charAList.add("AAA");
        charAList.add("BBB");
        charAList.add("CCC");
        charBList.add("CCC");
        charBList.add("DDD");
        charBList.add("EEE");

        //并集
        charAList.addAll(charBList);
        //交集
        charAList.retainAll(charBList);
        //差集
        charAList.removeAll(charBList);
        //无重复并集 先移除相同的，在求并集
        charBList.removeAll(charAList);
        charAList.addAll(charBList);


    }
}
