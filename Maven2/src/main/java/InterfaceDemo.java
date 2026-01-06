interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Drawable c = new Circle();
        Drawable r = new Rectangle();

        c.draw();
        r.draw();
    }
}
