package ArrayLCWD;

public class Array {
	public static void main(String[] args) {
		
		//create array
		//declare array + initialize the array
		int marks []={ 90,80,10,20,50,75 };   //one method is marks
		
		
		//declare the array
		
		
		//initialize the array
		int size =4;
	   int	failedStudentMarks []= new int[size];//second method is failedStudentMarks
		
	   //now check how to access data
	   System.out.println(marks.length);
	   
	   System.out.println(marks[0]);
	   System.out.println(marks[2]);
	   System.out.println(marks[4]);
	   System.out.println(marks[5]);
	   
	   System.out.println("---------------------");
	   System.out.println(marks[marks.length-1]);  //75-1, 50--2, 20--3 -----aise 90 tak jaayega
	   
	   
	   
	   System.out.println("failedStudentMarks wala hai " + failedStudentMarks.length);
	   
	   System.out.println(failedStudentMarks[0]);//iska output null rahega kyuki mainey sirf size diya hai kuch declare nhi kiya hai
	   System.out.println(failedStudentMarks[1]);
	   
	   System.out.println("-----------------------");
	   //print all the data of marks array issme array taverse kiye means ek ek karke jaana
	   for(int i=0; i<marks.length ; i++) {
		   System.out.println("yeah pure marks ka length nikaalega " + i+ " is "+marks[i]);
		  
	   }
	   
	   //enhance loop i.e for each loop
	   System.out.println("------------------");
	 //modify the data 90 ki jagah 100 kar rahe hai
	   
	   marks[0]=100;
	   for(int mark : marks) {
		   System.out.println(mark);
		   
		   
	   }
	   
	   //modify the data
	   
	}
	

}
