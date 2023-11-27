//method overloading
public class polymorphism {
    void demo(int a){
        System.out.println("a: "+a);
    }
    void demo(int a, int b){
        System.out.println("a and b "+a+", "+b);
    }
    double demo(double a){
        System.out.println("Double a "+a);
        return a*a;
    }
}
class methodoverload{
    public static void main(String[] args) {
        polymorphism obj = new polymorphism();
        double result;
        obj.demo(10);
        obj.demo(5, 6);
        result = obj.demo(5.57);
    }
}