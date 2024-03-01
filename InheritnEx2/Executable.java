package InheritnEx2;

public class Executable extends Object {
    static {
        System.out.println("Static Block from Executable class");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Lizard l = new Lizard();
    }
}
