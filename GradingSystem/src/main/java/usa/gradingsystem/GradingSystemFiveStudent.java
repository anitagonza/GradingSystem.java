
 
package usa.gradingsystem;

    import java.util.Scanner;


/**
 *
 * @author anita
 */
// As a modifying program for 5 student's scores,processes grades,counting each grade per student

//user is expected to determine grade + mark and displays result
// sample scores user enter 85,15,0,34,50,79,80,100.
       
public class GradingSystemFiveStudent {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;

        // Counters for grades 1–9
        int g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        int g6 = 0, g7 = 0, g8 = 0, g9 = 0;

        while (count <= 5) {
            System.out.print("Enter score for student " + count + ": ");
            int score = input.nextInt();

            int grade;
            String remark;

            if (score >= 80) {
                grade = 1; remark = "D1"; g1++;
            } else if (score >= 75) {
                grade = 2; remark = "D2"; g2++;
            } else if (score >= 66) {
                grade = 3; remark = "C3"; g3++;
            } else if (score >= 60) {
                grade = 4; remark = "C4"; g4++;
            } else if (score >= 50) {
                grade = 5; remark = "C5"; g5++;
            } else if (score >= 45) {
                grade = 6; remark = "C6"; g6++;
            } else if (score >= 35) {
                grade = 7; remark = "P7"; g7++;
            } else if (score >= 30) {
                grade = 8; remark = "P8"; g8++;
            } else {
                grade = 9; remark = "F"; g9++;
            }

            System.out.println("Grade: " + grade + " Remark: " + remark);
            System.out.println();

            count++;
        }

        // Summary
        System.out.println("----- SUMMARY -----");
        System.out.println("Grade 1: " + g1);
        System.out.println("Grade 2: " + g2);
        System.out.println("Grade 3: " + g3);
        System.out.println("Grade 4: " + g4);
        System.out.println("Grade 5: " + g5);
        System.out.println("Grade 6: " + g6);
        System.out.println("Grade 7: " + g7);
        System.out.println("Grade 8: " + g8);
        System.out.println("Grade 9: " + g9);
    }
}
    

