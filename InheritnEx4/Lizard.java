package InheritnEx4;

public class Lizard extends Animal {
    static {
        System.out.println("Static Block from Lizard class");
    }

    Lizard() {
        System.out.println("Lizard class Const");
    }

    {
        System.out.println("Non-Static Block from Lizard class");
    }

}
