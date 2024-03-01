package InheritnEx3;

public class Lizard extends Animal {
    static {
        System.out.println("Static Block from Lizard class");
    }
    {
        System.out.println("Non-Static Block from Lizard class");
    }
}
