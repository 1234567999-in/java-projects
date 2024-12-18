package package1;

	import java.util.Scanner;

	public class StudentGrades{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Input: Number of subjects
	        System.out.print("Enter the number of subjects: ");
	        int numberOfSubjects = scanner.nextInt();
	        
	        // Array to store marks for each subject
	        int[] marks = new int[numberOfSubjects];
	        int totalMarks = 0;
	        
	        // Input: Marks for each subject
	        for (int i = 0; i < numberOfSubjects; i++) {
	            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
	            marks[i] = scanner.nextInt();
	            totalMarks += marks[i];
	        }
	        
	        // Calculate average percentage
	        double averagePercentage = (double) totalMarks / numberOfSubjects;

	        // Grade calculation
	        char grade;
	        if (averagePercentage >= 90) {
	            grade = 'A';
	        } else if (averagePercentage >= 80) {
	            grade = 'B';
	        } else if (averagePercentage >= 70) {
	            grade = 'C';
	        } else if (averagePercentage >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }

	        // Display results
	        System.out.println("\nResults:");
	        System.out.println("Total Marks: " + totalMarks);
	        System.out.println("Average Percentage: " + averagePercentage + "%");
	        System.out.println("Grade: " + grade);

	        scanner.close();
	    }
	}


