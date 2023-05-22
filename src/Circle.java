public class Circle extends Shape{
  
    private int radius;


    public Circle(int radius) {
        this.radius = radius;
        setName("Circle");
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * (float) radius * (float) radius);
    }

    @Override
    public String toString() {
        return "Circle {" + "name= " + getName() +
                ", radius= " + radius + ", area= " + getArea() +
                '}';
    }
}

