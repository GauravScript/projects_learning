package DesignPatterns;

interface Shape {
    public void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("This Is Circle Draw");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("This Is Rectangle Draw");
    }
}

class Squre implements Shape {
    public void draw() {
        System.out.println("This Is Square Draw");
    }
}

class ShapeFactory {
    public Shape getInstance(String shape) {
        if (shape == null || shape == "") {
            System.out.println("NO Shape passed");
            return null;
        } else if (shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("rectangle")) {
            return new Rectangle();
        } else if (shape.equals("square")) {
            return new Squre();
        } else return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        ShapeFactory ob = new ShapeFactory();
        Shape shape = ob.getInstance("");
        try {
            shape.draw();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

}
