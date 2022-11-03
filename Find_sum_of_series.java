import java.util.Scanner;
class series
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,i; float sum=0; n=Sc.nextInt(); for(i=1;i<=n;i++) { sum=sum+(1.0f/i); } System.out.format("%.2f",sum); }}