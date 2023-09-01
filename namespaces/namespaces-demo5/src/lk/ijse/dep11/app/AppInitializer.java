package lk.ijse.dep11.app;

import lk.ijse.dep11.app.api.Util;

//import static lk.ijse.dep11.app.api.Util.PI;
//import static lk.ijse.dep11.app.api.Util.myMethod;
import static lk.ijse.dep11.app.api.Util.*;

public class AppInitializer {

    public static void main(String[] args) {
        // A.myPrivateMethod();
        A.myPackagePrivateMethod();
        A.myProtectedMethod();

        System.out.println(PI);
        print();
        myMethod();
        doSomething();
    }

    static void print(){
        System.out.println("Hello Print");
    }
}

class A{

    private static void myPrivateMethod(){
        System.out.println(PI);
        myMethod();
        System.out.println("lk.ijse.dep11.app.A.myPrivateMethod()");
    }

    static void myPackagePrivateMethod(){
        System.out.println("lk.ijse.dep11.app.A.myPackagePrivateMethod()");
    }

    protected static void myProtectedMethod(){
        System.out.println("lk.ijse.dep11.app.A.myProtectedMethod()");
    }

    public static void myPublicMethod(){
        System.out.println("lk.ijse.dep11.app.A.myPublicMethod");
    }

}