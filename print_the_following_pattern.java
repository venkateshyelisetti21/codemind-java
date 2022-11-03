import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int row_size,out,in; row_size=Sc.nextInt(); for(out=row_size;out>=1;out--) { for(in=row_size;in>=1;in--) System.out.print(in+" "); System.out.println(); } }}