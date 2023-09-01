package lk.ijse.dep11.app;

import lk.ijse.dep11.app.second.*;

public class AppInitializer {

    public static void main(String[] args) {
//        lk.ijse.dep11.app.first.A.myMethod1();
//        lk.ijse.dep11.app.first.A.myMethod2();
        lk.ijse.dep11.app.first.A.myMethod3();

        lk.ijse.dep11.app.second.A.myMethod2();
        lk.ijse.dep11.app.second.A.myMethod3();

        //A.myMethod2();
    }
}

class C{

    void myMethod(){
        //A.myMethod2();
    }

}
class D{}
