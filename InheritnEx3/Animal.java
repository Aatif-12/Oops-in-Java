package InheritnEx3;

public class Animal extends Object {
    static {
        System.out.println("Static Block from Animal class");
    }
    {
        System.out.println("Non-Static Block from Animal class");
    }
}
