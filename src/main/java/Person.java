/**
 * Created by xiehao on 2018/11/7.
 */
public class Person {
    private String name;
    private int age;
    private static String country;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show(){
        System.out.println("name: "+name+",age: "+age+",country: "+country);
    }
}
