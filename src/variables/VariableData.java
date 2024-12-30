package variables;

public class VariableData {
	
	public static void printMessage(String message) {
		System.out.println(message);
	}
	
	//starting point of our class
	public static void main(String args[] ){

		System.out.println("DSA titorial");//console par print kar raha hai
		System.out.println("learn DSA titorial from A to Z");//console par print kar raha hai
		printMessage("hello DSA");//static se hm directly call kar sakte hai and yeah bhi //console par print kar raha hai

	int x=60;
	System.out.println("value of x is " +x);
	
	x=70;  //agar ise add kar rahe hai hai toh purana value jo 60 hai woh override ho jaayega
	System.out.println("value of x is " +x);
	
	
 x=100;
	System.out.println("value of x is " +x);
	
	
	double marks=67.79;
	System.out.println("your marks is " +marks);
	
	float f=7.88f;
	System.out.println("this is float is " +f);
	
	char ch='a';
	System.out.println("this is ch is " +ch);

	char ch1='A';
	System.out.println("this is ch1 is " +ch1);
	
	
	boolean isActive=true;
	System.out.println("this is boolean is " + isActive);

	
	boolean isProductLive=false;
	System.out.println("this is boolean is " + isProductLive);
	
	
	
	//using non-primitive datatypes
	
	Student stud= new Student();
	stud.name="Ayush";
	stud.phone="7355112388";
	stud.city="varanasi";
	stud.rollNumber=10043945;
	
	
	System.out.println("this is student1 name " +stud.name);
	System.out.println("this is student1 phone " +stud.phone);
	System.out.println("this is student1 city " +stud.city);
	System.out.println("this is student1 rollno " +stud.rollNumber);
	
	Student stud1= new Student();
	stud1.name="Ayushi";
	stud1.phone="9170677660";
	stud1.city="varanasi";
	stud1.rollNumber=10043945;
	
	
	System.out.println("this is student1 name " +stud1.name);
	System.out.println("this is student1 phone " +stud1.phone);
	System.out.println("this is student1 city " +stud1.city);
	System.out.println("this is student1 rollno " +stud1.rollNumber);
	
	}
}