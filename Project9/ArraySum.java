package Project9;

public class ArraySum {
	static int ar[]= {1,2,3,4,5,6};
	static int sumOfarr() {
		int s=0;
		int i;
		for(i=0;i<ar.length;i++)
		{
			s+=ar[i];
			
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implementation of array and sum of array:"+ sumOfarr());
	}

}
