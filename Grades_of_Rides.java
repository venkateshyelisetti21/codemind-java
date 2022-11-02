import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); int h,s,sp; h=Sc.nextInt(); s=Sc.nextInt(); sp=Sc.nextInt(); if(h>50 && s>60 && sp>100){ System.out.println("10"); } else if(h>50 && s>60){ System.out.println("9"); } else if(s>60 && sp>100){ System.out.println("8"); } else if(h>50 && sp>100){ System.out.println("7"); } else if(h>50){ System.out.println("6"); }else if(s>60){ System.out.println("6"); }else if(sp>100){ System.out.println("6"); } else System.out.println("5"); }}
