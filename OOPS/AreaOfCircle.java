public class AreaOfCircle {
    public static void main(String[] args) {
        circle radius=new circle(10);
   System.out.println("The radius of circle is :"+radius);
   radius.display();
    }
}
class circle{
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double circumference() {
        return 2 * Math.PI * radius;
    }
    void display(){
        System.out.println("The area of circle is "+area());
        System.out.println("Circumference of circle is :"+circumference());
    }
    
}


