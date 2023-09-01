package lk.ijse.dep11.app.first;

public class A {

    private static void myMethod1(){
        System.out.println("first.A: myMethod1()");
    }

    static void myMethod2(){
        myMethod1();
        System.out.println("first.A: myMethod2()");
    }

    public static void myMethod3(){
        System.out.println("first.A: myMethod3()");
    }
}
