package InheritnEx4;

public class Cat extends Animal {
    static {
        System.out.println("Static Block from Cat class");
    }
    {
        System.out.println("Non-Static Block from Cat class");
    }

    Cat() {
        System.out.println("Cat class Const");
    }
}
