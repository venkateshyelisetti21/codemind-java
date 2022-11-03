import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,a=0,b=1,c,count=3; n=Sc.nextInt(); System.out.print(a+" "+b+" "); while(count<=n) { c=a+b; a=b; b=c; System.out.print(c+" "); count++; } }}