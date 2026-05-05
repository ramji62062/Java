import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;



public class gradeCalculator {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);

    System.out.println("========== Grade Calculator ============");
        System.out.print("Student Name: ");
        String studentName= sc.nextLine();

        System.out.print("Enter marks of maths (out of 100): ");
        int mathMarks = sc.nextInt();
        System.out.print("Enter marks of Science (out of 100): ");
        int scienceMarks = sc.nextInt();
        System.out.print("Enter marks of English (out of 100): ");
        int englishMarks = sc.nextInt();
        System.out.print("Enter marks of Hindi (out of 100): ");
        int hindiMarks = sc.nextInt();

        double average=(mathMarks+scienceMarks+englishMarks+hindiMarks)/4.0;

        String grade;
        String remark;

        if (average >= 90) {
            grade = "A+";
            remark = "Outstanding!";
        } else if (average >= 80) {
            grade = "A";
            remark = "Excellent!";
        } else if (average >= 70) {
            grade = "B";
            remark = "Good work!";
        } else if (average >= 60) {
            grade = "C";
            remark = "Satisfactory";
        } else if (average >= 40) {
            grade = "D";
            remark = "Needs improvement";
        } else {
            grade = "F";
            remark = "Failed - Please retake";
        }

        System.out.println("=========== Report Card==========");
        System.out.println("student "+studentName);
        System.out.println("Math :" + mathMarks);
        System.out.println("science :" + scienceMarks);
        System.out.println("English :" + englishMarks);
        System.out.println("Hindi :" + hindiMarks);
        System.out.println("Average :" +String.format("%2f",average));
        System.out.println("Grade :" + grade);
        System.out.println("Remark :" + remark);
        System.out.println("========================================");

    }
}