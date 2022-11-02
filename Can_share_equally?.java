import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int x=Sc.nextInt(); int y=Sc.nextInt(); if(x%2==0 && (x>0 || y%2==0)) { System.out.println("YES"); } else { System.out.println("NO"); } }}