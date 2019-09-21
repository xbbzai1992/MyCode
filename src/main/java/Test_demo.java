/**
 * Created by xiehao on 2018/11/5.
 */
public class Test_demo {
    public static void main(String[] args) {

        //HelloWorld test
        System.out.println("---------- 一个简单类 ----------");
        HelloWorld helloworld = new HelloWorld();
        helloworld.show();
        //System.out.println("-- -- -- -- -- -- -- -- -- -- -- -- -- -- --");

        //Hi test 匿名调用用法
        System.out.println("---------- 匿名调用 ----------");
        Hi hi = new Hi();
        hi.show();//显示创建对象调用
        new Hi().show(); //匿名调用

        //Student test 普通类建立
        System.out.println("---------- 一个普通类 ----------");
        Student student1 = new Student();
        student1.setName("magan");
        student1.setAge(1);
        student1.show();
        System.out.println(student1.getName() +" --- "+ student1.getAge());

        //Person test static用法
        System.out.println("---------- static使用 ----------");
        Person person1 = new Person("one",18,"china");
        Person person2 = new Person("two",19);
        Person person3 = new Person("three",20);
        person1.show();
        person2.show();
        person3.show();

        //继承
        System.out.println("---------- 继承的使用 ----------");
        //父类无参
        Zi zi1 = new Zi(); //无参
        Zi zi2 = new Zi("name");//有参
        System.out.println("- - - - - - - - - - - - -");
        //父类有参
        Zi2 zi21 = new Zi2();
        Zi2 zi22 = new Zi2("name");
        //Final 关键字
        Zi3 zi3 = new Zi3();
        zi3.show();
        System.out.println("---------- 多态的使用 ----------");
        Fu4 f4 = new Zi4();
        //找不到符号
        //f.method();
        f4.show();
    }
}
