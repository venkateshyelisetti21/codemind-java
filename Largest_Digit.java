import java.util.Scanner;
class digit
{ public static int largestdigit(int n) { int r,max=0; while(n>0) { r=n%10; if(r>max) max=r; n=n/10; } return max; } public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,result=0; n=Sc.nextInt(); result=largestdigit(n); System.out.println(result); } }