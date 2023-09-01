package lk.ijse.dep11.app;

import lk.ijse.dep11.app.api.MyController;

public class B {

    static void doSomething(){
        // A.myPrivateMethod();
        A.myPackagePrivateMethod();
        A.myProtectedMethod();
        A.myPublicMethod();
        MyController.print();
    }
}
