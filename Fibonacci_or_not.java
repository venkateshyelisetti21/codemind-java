import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,a=0,b=1,c,found=0; n=Sc.nextInt(); c=a+b; while(c<=n) { if(c==n) { found=1; break; } a=b; b=c; c=a+b; } if(found==1) System.out.println("True"); else System.out.println("False"); }}