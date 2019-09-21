/**
 * Created by xiehao on 2019-02-06.
 */

/*
    final 关键字
    继承的代码体现

	由于继承中方法有一个现象：方法重写。
	所以，父类的功能，就会被子类给覆盖调。
	有些时候，我们不想让子类去覆盖掉父类的功能，只能让他使用。
	这个时候，针对这种情况，Java就提供了一个关键字：final

	final:最终的意思。常见的是它可以修饰类，方法，变量。
	    特点：
		final可以修饰类，该类不能被继承。
		final可以修饰方法，该方法不能被重写。(覆盖，复写)
		final可以修饰变量，该变量不能被重新赋值。因为这个变量其实常量。

	常量：
		A:字面值常量
			"hello",10,true
		B:自定义常量
			final int x = 10;

*/

class Fu3{
    public final int num = 10;
    /*public void show(){
        System.out.println(num);
    }*/
}
public class Zi3 extends Fu3{
    public void show(){
        /*  num = 30;  因为父类变量被Final修饰，不能设置*/
        System.out.println(num);
    }
}
