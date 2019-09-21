/**
 * Created by xiehao on 2018/11/5.
 */
public class Student {
    private String name;
    private int age;

    public Student(){}

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name; //相当于student.name = name
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }
}
