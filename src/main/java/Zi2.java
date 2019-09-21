/**
 * Created by xiehao on 2018/11/12.
 */
/*
继承中构造方法的关系
		A:子类中所有的构造方法默认都会访问父类中空参数的构造方法
		B:为什么呢?
			因为子类会继承父类中的数据，可能还会使用父类的数据。
			所以，子类初始化之前，一定要先完成父类数据的初始化。

			注意：子类每一个构造方法的第一条语句默认都是：super();

*/
class Fu2{
    public Fu2(){
        System.out.println("父类无参构造方法");
    }
    public Fu2(String name){
        System.out.println("父类有参构造方法");
    }
}
class Zi2 extends Fu2 {
    public Zi2(){
        super("name");//显示调用父类无参构造 必须写在第一行
        System.out.println("子类无参构造方法");
    }
    public Zi2(String name){
        super("name");
        System.out.println("子类有参构造方法");
    }

}
