import java.util.Scanner;
class Main{
public static void main (String args[]){
int a,b,c=1;
int letter=64;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows=scan.nextInt();
System.out.print("\nYour pattern here :\n \n");
for(a=1; a<=rows; a++){
  for(b=1; b<=a; b++,c++){
  System.out.print((char)(c+letter));
}
System.out.println();
}
}
}