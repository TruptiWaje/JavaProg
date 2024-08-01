package demoProject;
import java.util.*;


public class SeparateCAndV {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter name:");
	String name=sc.next();
	String[] v = name.split("(?i)[^aeiou]");
	String[] c = name.split("(?i)[aeiou]");
	System.out.print("Vowels are:");
	for(String i:v)
	{
		System.out.print(i);
	}
	System.out.println();
	System.out.print("Consonents are:");
	for(String j:c)
	{
		System.out.print(j);
	}
	sc.close();

}
	
}
