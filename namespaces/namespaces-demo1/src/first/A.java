package first;

public class A {

    public static void main(String[] args) {
        System.out.println("Package: First");

        System.out.println(new first.B());
        System.out.println(new B());        // first.B()

        System.out.println(new second.B());

//        System.out.println(new default.Demo());
//        System.out.println(new Demo());
//        System.out.println(new AppInitializer());
    }
}
