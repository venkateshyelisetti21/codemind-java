import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int i,j,n; n=Sc.nextInt(); for(i=n;i>=1;i--) { for(j=1;j<=i;j++) { System.out.print((char)(i+64)+" "); } System.out.println(); } }}