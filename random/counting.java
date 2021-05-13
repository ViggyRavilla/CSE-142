import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        System.out.println("Enter how many numbers you want to count until");
        int count = s.nextInt();
        System.out.println("Sequence: ");
        System.out.println(num);
        s.close();
    for(int i=1;i<=count;i++) {
         System.out.println(num+1);
         num+=1;
     }   
    }
}
