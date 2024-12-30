package loopExamples;

public class loops {
	public static void main (String [] args) {
		
		//1 to 1
		for(int i=1; i<=10;i++)
		//for(int i=0; i<=10; i=i+2 ) 
		
		{
			System.out.print(i + " ");
		}
		
		System.out.println();
		for(int i=10; i>0;i--) {
			System.out.print(i + "  ");
		}
		
		
		
	//while loop entry control loop hai and do while exit control loop hai
		System.out.println();//niche aane ke liye likhe hai agar nhi likhte toh 10 se 1 ke sath aata hai 100
		int j=100;
		while(j<=100) {
			System.out.println(j);
			j++;
		}
		
		//for each
		System.out.println();
		//int[] array;
		int[] arr = {12,13,14,15,16};
		for(int array: arr) {
			System.out.println( array);
		}
		
		
		
		
	}

}
