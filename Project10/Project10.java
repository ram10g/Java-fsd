package Project10;

import java.util.regex.*;
import java.util.Scanner;

public class Project10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		Pattern pat=Pattern.compile(s);
		System.out.println("enter the string with matching is perform:");
		String sm=sc.nextLine();
		Matcher m=pat.matcher(sm);
		while(m.find())
		{
			System.out.println("Pattern Found form"+(m.start()+1)+"to"+(m.end()));
		}
	}

}
