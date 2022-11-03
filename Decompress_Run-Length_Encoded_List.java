import java.util.Scanner;
class sample
{ public static void decompressArray(int x[],int n) { int k; for(int i=0;i<n;i=i+2) { k=x[i]; while(k-->0) { System.out.print(x[i+1]+" "); } } } public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int x[],n; n=Sc.nextInt(); x=new int[n]; for(int i=0;i<n;i++) x[i]=Sc.nextInt(); decompressArray(x,n); }}