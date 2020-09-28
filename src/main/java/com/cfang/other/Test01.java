package com.cfang.other;

/**
 * @author cfang 2020/9/17 10:44
 * @description
 * 第一步：执行new Dervied()时，因为Dervied继承父类Base，所以先调用父类构造中的方法，但因为子类覆写了父类的方法，所以第一个调用的tellName方法实际上是Dervied.tellName()方法，
 *          tellName方法要打印name域（子类Dervied）的值，但是当前Dervied对象中的name域还没有被初始化，所以打印出来的值为null。printName()方法执行与tellName()方法一致。
 * 第二步：调用子类Dervied中的构造方法，因为这时子类的name域已经初始化完，因此可以正常打印。
 */
public class Test01 extends Base{

    private String name = "test01";

    public Test01(){
        sayName();
        tellName();
    }

    public void sayName(){
        System.out.println("Test01 say name :" + name);
    }

    public void tellName(){
        System.out.println("Test01 tellName name :" + name);
    }

    public static void main(String[] args) {
        new Test01();
    }

}

class Base{
    private String name = "base";

    public Base(){
        sayName();
        tellName();
    }

    public void sayName(){
        System.out.println("base say name :" + name);
    }

    public void tellName(){
        System.out.println("base tellName name :" + name);
    }
}
