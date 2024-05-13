import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects = 6; // Assuming 6 subjects, you can change this as needed
        int[] marks = new int[numSubjects];
        float totalMarks = 0;
        float averagePercentage;

        System.out.println("Enter marks obtained in each subject (out of 100):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }
        scanner.close();

        averagePercentage = totalMarks / numSubjects;

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);

        // Grade calculation
        char grade;
        if (averagePercentage >= 80) {
            grade = 'A';
        } else if (averagePercentage >= 60) {
            grade = 'B';
        } else if (averagePercentage >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Grade: " + grade);
    }
}
