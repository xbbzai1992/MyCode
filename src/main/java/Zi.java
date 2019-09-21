/**
 * Created by xiehao on 2018/11/12.
 */
class Fu{
    public Fu(){
        System.out.println("父类的无参构造方法");
    }
    public Fu(String name){
        System.out.println("父类的有参构造方法");
    }
}

class Zi extends Fu{
    public Zi(){
        System.out.println("子类的无参构造方法");
    }
    public Zi(String name){
        System.out.println("子类的有参构造方法");
    }
}
