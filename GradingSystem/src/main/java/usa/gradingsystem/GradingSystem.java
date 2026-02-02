

   package usa.gradingsystem;

        import java.util.Scanner;


/**
 *
 * @author anita
 */
    // prompting a user to enter 0-100 scores,determing grade and & remarks using if else statement
   

    public class GradingSystem {
        
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
    // validation rules to prompt a user to enter only valid scores
       // Enter student's score (0 - 100): abc
       //Error: Please enter a number only.
       
      //Enter student's score (0 - 100): -5
      //Error: Score must be between 0 and 100.
      
      //Enter student's score (0 - 100): 120
      //Error: Score must be between 0 and 100.
      
      //Enter student's score (0 - 100): 85
      //Score: 85
      //Grade: 1
      //Remark: D1
    
     int score = -1;

    while (true) {
       System.out.print("Enter student's score (0 - 100): ");

    if (!input.hasNextInt()) {
        System.out.println("Error: Please enter a number only.");
        input.next(); // clear wrong input
        continue;
    }

    score = input.nextInt();

    if (score < 0 || score > 100) {
        System.out.println("Error: Score must be between 0 and 100.");
    } else {
        break; // valid input → exit loop
    }
}

        int grade;
        String remark;

        if (score >= 80 && score <= 100) {
            grade = 1;
            remark = "D1";
        } else if (score >= 75) {
            grade = 2;
            remark = "D2";
        } else if (score >= 66) {
            grade = 3;
            remark = "C3";
        } else if (score >= 60) {
            grade = 4;
            remark = "C4";
        } else if (score >= 50) {
            grade = 5;
            remark = "C5";
        } else if (score >= 45) {
            grade = 6;
            remark = "C6";
        } else if (score >= 35) {
            grade = 7;
            remark = "P7";
        } else if (score >= 30) {
            grade = 8;
            remark = "P8";
        } else {
            grade = 9;
            remark = "F";
        }

        System.out.println("\nScore: " + score);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);
    }
}
    

