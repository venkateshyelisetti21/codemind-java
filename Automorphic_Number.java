import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,d,sq,r; n=Sc.nextInt(); d=(int)Math.log10(n)+1; sq=n*n; r=sq%(int)Math.pow(10,d); if(r==n) System.out.println("Automorphic Number"); else System.out.println("Not an Automorphic Number"); }}