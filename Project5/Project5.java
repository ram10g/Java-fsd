
package Project5;
import java.util.*;


public class Project5{
	public static void main(String args[]) {
		ArrayList<String> lists=new ArrayList<String>();
		lists.add("Welcome");
		lists.add("to");
		lists.add("Java World");
		Iterator<String> itr =lists.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}	
}