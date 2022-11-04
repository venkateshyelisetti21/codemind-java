import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n; n=Sc.nextInt(); double d=Math.sqrt(n); if((d-(int)d)>0) System.out.println("False"); else System.out.println("True"); }}