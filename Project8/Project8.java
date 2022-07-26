package Project8;
import java.util.Scanner;
public class Project8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.nextLine();
		
		StringBuffer strb= new StringBuffer(str);
		strb.reverse();
		System.out.println("Output of the String to StringBuffer: "+strb);
		
		StringBuilder strbl= new StringBuilder(str);
		System.out.println("Enter the string to be append:");
		String s=sc.nextLine();
		strbl.append(" ");
		strbl.append(s);
		System.out.println("Output of string to StringBuilder: "+strbl);
		
	}

}
