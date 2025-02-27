import java.util.Scanner;

public class grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int totalMarks=0;
        System.out.println("How many sub is there?");
        int sub=sc.nextInt();
        int []marks=new int[sub];
        boolean count=true;
        for (int i = 0; i < sub; i++) {
            System.out.println("Enter marks of subject "+(i+1));
            marks[i]=sc.nextInt();
            if (marks[i] < 36) {
                count=false;
            }
            totalMarks+=marks[i];
        }


       int avgPercentage=totalMarks/sub;
        if (count) {
            if (avgPercentage > 90) {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tGrade = A");
            } else if (avgPercentage>80) {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tGrade = B");
            } else if (avgPercentage>70) {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tGrade = C");
            } else if (avgPercentage>60) {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tGrade = D");
            } else if (avgPercentage>50) {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tGrade = E");
            }else {
                System.out.println("Total marks = "+totalMarks+"\tPercentage = "+avgPercentage+"\tYou have to work hard u scored very low Grade");
            }
        }else {
            System.out.println("you are failed !!!!!");
        }

    }
}
