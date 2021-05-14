import java.util.Scanner;
public class morepatterns {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,k=1;
        System.out.println("Enter how many numbers you want");
        int count = s.nextInt();
        System.out.println("Number Sequence:");
        System.out.println(k);
        for(i=1;i<=count;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(k+1);
                k+=1;
            }
        }
    }
}
