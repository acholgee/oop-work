import java.util.Scanner;

public class GradesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = scanner.nextInt();
        }

        double totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double average = totalMarks / numSubjects;

        char grade;
        if (average >= 93) {
            grade = 'A';
        } else if (average >= 85) {
            grade = 'B';
        } else if (average >= 80) {
            grade = 'C';
        } else if (average >= 75) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);

        if (average >= 75) {
            System.out.println("Result: Passed");
        } else {
            System.out.println("Result: Failed");
        }

        scanner.close();
    }
}
