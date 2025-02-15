import java.util.*;

class student {
    int rollno;
    String name;
    int marks;
    static int count = 0; 

    student() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter rollno");
        rollno = s.nextInt();
        System.out.println("Enter name");
        name = s.next();
        System.out.println("Enter marks");
        marks = s.nextInt();
        count++; 
    }

    
    void display() {
        System.out.println("RollNo: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Rank {
    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();
        
        
        student[] students = new student[n];
        
      
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            students[i] = new student(); // Create a new student object and take input
        }
        
       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].marks < students[j + 1].marks) {
                   
                    student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        
        System.out.println("\nRank List:");
        for (int i = 0; i < n; i++) {
            System.out.println("Rank " + (i + 1) + ":");
            students[i].display();
        }

        s.close();
    }
}
