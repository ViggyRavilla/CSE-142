import java.util.Scanner;
public class calculator {
    public void add(int a,int b) {
        int c = a+b;
        System.out.println(c);
   } 
   public void subtract(int a,int b) {
    int c = a-b;
       System.out.println(c);
   }
   public void multiply(int a,int b) {
    int c = a*b;
       System.out.println(c);
   }
   public  void divide(int a,int b) {
    int c=a/b;
       System.out.println(c);
   }
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter the operation you want to do: ");
        String input = s.next();
        s.close();
        calculator obj1 = new calculator();
        switch(input) {
         case "add":
            obj1.add(a,b);
            break;
         case "subtract":
            obj1.subtract(a,b);
            break;
         case "multiply":
            obj1.multiply(a,b);
            break;
         case "divide":
            obj1.divide(a,b);
            break;
         default:
            System.out.println("Incorrect value. Please try again.");
            break;
        }

   }
}
