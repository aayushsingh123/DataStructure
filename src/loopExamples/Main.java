package loopExamples;

public class Main {
	public static void main(String[] args) {
		System.out.println("Code Started....");
		
		
		//object create
		int x=60;
		CoreJavaRevision revision = new CoreJavaRevision("aman", "aman@gmail.com", 1); //object ke refrence ko store kar raha hai reviision
		/*
		 * revision.name="aman"; revision.email="aman@gmail.com"; revision.studentId=1; ////constructor banaye hai eisliye ese hata rahe hai
		 */
		
		
		revision.showAll();
		revision.showName();
		
		
		System.out.println();
		
		//new issme allocate kar raha hai memory aapke  object ke liye matlab dynaic object
		CoreJavaRevision revision1 = new CoreJavaRevision( "amansingh@gmail.com","aman singh", 2); //object ke refrence ko store kar raha hai reviision
		/*
		 * revision1.name="aman singh"; revision1.email="amansingh@gmail.com";//constructor banaye hai eisliye ese hata rahe hai
		 * revision1.studentId=12;
		 */
		
		 revision1.showAll(); 
		 revision1.showName();
		 
		 
		 System.out.println();
		 CoreJavaRevision revision2 = new CoreJavaRevision("amansingh@gmail.com","aman", 1);
		 revision2.showName("lastname");
		 revision2.showName();
		
	}

}
