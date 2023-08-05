import java.util.Scanner;

public class StudentGradeCalculator {
    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        String grade = calculateGrade(marks);
        System.out.println("Grade of the student: " + grade);

        scanner.close();
    }
}