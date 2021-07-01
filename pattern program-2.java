import java.util.*;
public class Main
{
     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt(); 
        int a, b;
        for (a = 0; a < n; a++){
            for (b = 0; b < a + 1; b++)
                System.out.print("*");
            System.out.print("\n");
        }
        for (a = 1; a < n; a++) {
            for (b = a; b < n; b++)
               System.out.print("*");
          System.out.print("\n");
        }
    }
}
