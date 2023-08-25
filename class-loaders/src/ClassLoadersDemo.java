import com.sun.java.accessibility.util.EventID;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.logging.Logger;

public class ClassLoadersDemo {
    public static void main(String[] args) {

        // Application/System Class Loader
        ClassLoader loader1 = ClassLoadersDemo.class.getClassLoader();
        System.out.println(loader1);
        System.out.println(MyClass.class.getClassLoader());

        // Bootstrap Class Loader (Parent) (Loading Java SE Classes)
        ClassLoader loader2 = ArrayList.class.getClassLoader();
        System.out.println(loader2);
        ClassLoader loader3 = System.class.getClassLoader();
        System.out.println(loader3);

        // Utility/Extension/Platform Class Loader (Java SE ext Classes)
        ClassLoader loader4 = DriverManager.class.getClassLoader();
        System.out.println(loader4);
        ClassLoader loader5 = EventID.class.getClassLoader();
        System.out.println(loader5);
    }
}
