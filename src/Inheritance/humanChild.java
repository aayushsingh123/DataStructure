package Inheritance;

public class humanChild extends animalParent {
	String food= "rice";
	//yeah child humanChild apna ek or method bana raha hai
	public void eat1() {
		System.out.println("wow this is my child account " + this.food + " with " +super.food );
	}


}
