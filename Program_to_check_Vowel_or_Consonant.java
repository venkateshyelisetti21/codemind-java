import java.util.Scanner;
class sample
{ public static void main(String args[]) { Scanner Sc=new Scanner(System.in); char ch; ch=Sc.nextLine().charAt(0); switch(ch) { case'A': case'a': case'E': case'e': case'I': case'i': case'O': case'o': case'U': case'u': System.out.println("Vowel"); break; default: System.out.println("Consonant"); break; } }}