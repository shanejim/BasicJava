package reflection;

import entity.Student;

//反射：运行时生成对象实例，运行期间调用方法，运行时更改属性
//通过反射创建对象性能更低，程序需要动态创建某个类的对象时才考虑使用反射。比如从配置文件中读取只是某个类的字符串类名
//Class newInstance,Constructor
//Field
//Method
public class LearnReflect {
    public static void main(String[] args) {
        Student student = new Student();

        Class cla = student.getClass();
        Class cla2 = Student.class;
        try {
            Class cla3 = Class.forName("Student");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
