class Box {
    private int l, b, h;

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(String name) {
        System.out.println(name + " constructor called");
    }

    Box() {
        // constructor returns address of object to reference 

        this("String"); // calling 1 parameter constructor using this
        // this(2, 10, 69); // calling 3 parameter constructor using this


        System.out.println("Non Parametrised constructor called");

        // NOTE: Constructor calling line should be 1st , else syntax error
        //      => Call to 'this()' must be first statement in constructor or body
    }
}

class CallingConstructorUsingThis {
    public static void main(String[] args) {
        Box b = new Box();
    }
}