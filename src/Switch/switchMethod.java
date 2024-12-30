package Switch;

public class switchMethod {
	public static void main (String[] args) {
		
		String day="Mon";//depending on this value
		
		switch(day) {
		
		case "Mon" ://agar break statement nhi lagate hai toh mon ke sath Tues bhi chal jaayega
			System.out.println("it is monday");
			break;
			
		case "Tues" :
			System.out.println("it is Tuesday");
			break;
			
			
		case "Wed" :
			System.out.println("it is TWednesday");
			break;
			
			
		/*
		 * case "Thur" : System.out.println("it is Thursday"); break;
		 */
			
		case "Fri" :
			System.out.println("it is Friday");
			break;
			
		case "Sat" :
			System.out.println("it is Saturday");
			break;
			
		case "Sun" :
			System.out.println("it is Sunday");
			break;
			
			
			default:
				System.out.println("Invalid Day");
		
		}
		
	}

}
