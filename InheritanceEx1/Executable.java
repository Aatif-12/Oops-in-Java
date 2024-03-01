package InheritanceEx1;

/**
 * Executable
 */
public class Executable extends Object {
    static {
        System.out.println("Static Block from Executable Class");
    }

    public static void main(String[] args) {
        cat c = new cat();
        c.mOne();
        c.mTwo();
        dog d = new dog();
        d.mOne();
        d.mThree();
        lizard l = new lizard();
        l.mOne();
        l.mFour();
    }
}