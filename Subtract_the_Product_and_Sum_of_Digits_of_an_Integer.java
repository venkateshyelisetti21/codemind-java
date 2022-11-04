import java.util.Scanner;
class digit
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,r, sum=0,prod=1; n=Sc.nextInt(); while(n>0) { r=n%10; sum=sum+r; prod=prod*r; n=n/10; } System.out.println(Math.abs(prod-sum)); }}