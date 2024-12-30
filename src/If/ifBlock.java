package If;

public class ifBlock {
    public static void main(String[] args) {
        
        int n = 12;
        if (n > 0) {
            System.out.println("Yes, it is greater than 0");
        } else {
            System.out.println("No, this is not greater than 0");
        }

        int marks = 81;

        // Ladder If for grading
        if (marks > 90) {
            System.out.println("Grade A");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Grade B"); // Yeh print hoga kyunki marks 81 hai
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        int num = 142;
        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("It is even and greater than 0");
            } else {
                System.out.println("It is odd and greater than 0");
            }
        } else {
            System.out.println("Number is not greater than 0");
        }
    }
}
