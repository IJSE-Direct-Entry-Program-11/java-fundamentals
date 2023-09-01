package second;

public class A {

    public static void main(String[] args) {
        System.out.println("Package: Second");

        System.out.println(new second.B());
        System.out.println(new B());    // = second.B()

        System.out.println(new first.B());

        // System.out.println(new Demo());
        // System.out.println(new AppInitializer());
    }
}
