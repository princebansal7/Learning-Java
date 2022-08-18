class Demo {
    private int a;
    private int b;

    Demo(int x, int y) {
        a = x;
        b = y;
    }

    public void display() {
        System.out.println("a = " + a + " b = " + b);
        xyz(); // automatically puts "this" here by compiler
        this.xyz(); // "this" is keeping the current calling
        // object's reference => so xyz() is called for that object too
    }

    public void xyz() {
        System.out.println("Inside xyz()");
    }
}

public class This {
    public static void main(String[] args) {
        Demo d = new Demo(10, 69);
        d.display();
        Demo d2 = new Demo(11, 691);
        d2.display();
    }
}