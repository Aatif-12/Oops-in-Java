package InheritnEx3;

public class Cat extends Animal {
    static {
        System.out.println("Static Block from Cat class");
    }
    {
        System.out.println("Non-Static Block from Cat class");
    }
}
