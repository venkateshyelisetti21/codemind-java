import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int n=Sc.nextInt(); int arr[]=new int[n]; int a[]=new int[n]; for(int i=0;i<n;i++) { arr[i]=Sc.nextInt(); } int count=0; for(int i=0;i<n;i++) { for(int j=0;j<n;j++) { if(arr[i]>arr[j]) { count++; } } a[i]=count; count=0; } for(int i=0;i<n;i++) { System.out.print(a[i]+" "); } }}