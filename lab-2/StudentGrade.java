import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of marks: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter marks: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }

        System.out.println("Grades: ");
        for (int i = 0; i < n; i++) {
            int m = marks[i];
            if (m >= 80) {
                System.out.print("A+ ");
            } else if (m >= 70) {
                System.out.print("A ");
            } else if (m >= 60) {
                System.out.print("B ");
            } else if (m >= 50) {
                System.out.print("C ");
            } else if (m >= 40) {
                System.out.print("D ");
            } else {
                System.out.print("Fail ");
            }
        }

        sc.close();
    }
}