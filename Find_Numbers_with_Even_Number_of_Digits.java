import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int i; int n=Sc.nextInt(); int arr[]=new int[n]; int count=0; for(i=0;i<n;i++) { arr[i]=Sc.nextInt(); if(((int)Math.log10(arr[i])+1)%2==0) { count++; } } System.out.println(count); }}