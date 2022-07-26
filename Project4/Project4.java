package Project4;

public class Project4 {
	private String nm;
	public Project4() {
		System.out.println("Constructor Called:");
		nm = "Constructor";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project4 obj = new Project4();
		System.out.println("Constructor name= " + obj.nm);
	}

}
