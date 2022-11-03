import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int i,j,n; n=Sc.nextInt(); for(i=1;i<=n;i++) { for(j=1;j<=n;j++) { System.out.print((char)(i+64)+" "); } System.out.println(); } }}