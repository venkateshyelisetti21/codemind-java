import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int rows=Sc.nextInt(); for(int i=rows;i>=1;i--) { for(int j=1;j<=i;j++) { System.out.print(j+""); } System.out.println(); } }}