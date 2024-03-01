package InheritnEx4;

public class Executable extends Object {
    static {
        System.out.println("Static Block from Executable class");
    }

    public static void main(String[] args) {
        Lizard l = new Lizard();
        Dog d = new Dog();
        Cat c = new Cat();
    }
}
