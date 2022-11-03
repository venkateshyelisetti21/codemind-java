import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int t=Sc.nextInt(); for(int i=0;i<t;i++) { int a=Sc.nextInt(); int b=Sc.nextInt(); int count=0; for(int j=a;j<=b;j++) { int r=j%10; if(r==2 || r==3 || r==9) count++; } System.out.println(count); } }}