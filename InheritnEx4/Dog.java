package InheritnEx4;

public class Dog extends Animal {
    static {
        System.out.println("Static Block from Dog class");
    }
    {
        System.out.println("Non-Static Block from Dog class");
    }

    Dog() {
        System.out.println("Dog class Const");
    }
}
