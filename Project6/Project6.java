package Project6;
import java.util.Map;
import java.util.HashMap;

public class Project6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> num =new HashMap<>();
		num.put("One", 1);
		num.put("Two", 2);
		System.out.println("Map:-"+ num);
		System.out.println("Keys:- "+ num.keySet());
		System.out.println("Values:- "+num.values());
		System.out.println("Entries:- "+ num.entrySet());
		int value=num.remove("One");
		System.out.println("Removed Value:"+ value);
	}

}
