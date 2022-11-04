import java.util.Scanner;
class difference
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,d,len,d1,d2; n=Sc.nextInt(); d=Sc.nextInt(); len=(int)Math.log10(n)+1; d2=n%(int)Math.pow(10,d); d1=n/(int)Math.pow(10,len-d); System.out.println(Math.abs(d1-d2)); }}