import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i=1,j;
        System.out.println("Enter how many stars you want: ");
        int count = s.nextInt();
        s.close(); 
        for(i=1;i<=count;i++) {
            for(j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
