public class Circle {
    double radius ;
    String color ;
    int id;
    public Circle( int id, double radius, String color) {
        this.id=id;
        this.radius = radius;
        this.color = color;

    }

    public Circle() {
        id++;
    }

    public double getRadius(){
       return  this.radius;
    }
    public String getColor(int k){
     return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle" + id+
                "\nradius:" + radius +
                "\ncolor:" + color
                ;
    }
}
