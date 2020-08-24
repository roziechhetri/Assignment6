public class Main{

    public static void main(String args[]){

        Rectangle r1= new Rectangle();

        System.out.println("Area of r1: "+ r1.area());

        Rectangle r2= new Rectangle(20,30);

        System.out.println("Area of r2: "+ r2.area());

        Rectangle r3= new Rectangle(10);

        System.out.println("Area of r3: "+ r3.area());

    }

}
