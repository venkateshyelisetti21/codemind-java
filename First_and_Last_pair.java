import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n,x[],m=0; n=Sc.nextInt(); x=new int[n]; for( int i=0;i<n;i++) x[i]=Sc.nextInt(); for(int j=0;j<n/2;j++) System.out.print(x[j]+" "+x[n-1-j]+" "); if(n%2!=0) System.out.print(x[n/2]+" 0"); }}