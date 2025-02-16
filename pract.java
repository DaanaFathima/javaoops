import java.util.*;

class Person {
    String name;
    String gender;
    long phnno; 
    Person(String name, String gender, long phnno) {
        this.name = name;
        this.gender = gender;
        this.phnno = phnno;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Phone: " + phnno);
    }
}

class Student extends Person {
    String course;
    Float score;

    Student(String name, String gender, long phnno, String course, Float score) {
        super(name, gender, phnno);
        this.course = course;
        this.score = score;
    }

    public void display() {
        super.display();
        System.out.println("Course: " + course);
        System.out.println("Score: " + score);
    }
}

class PgStudent extends Student {
    String researchArea;
    String grade;

    PgStudent(String name, String gender, long phnno, String course, Float score, String researchArea, String grade) {
        super(name, gender, phnno, course, score);
        this.researchArea = researchArea;
        this.grade = grade;
    }

    public void display() {
        super.display();
        System.out.println("Research Area: " + researchArea);
        System.out.println("Grade: " + grade);
    }
}

public class pract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s.nextInt();

        
        PgStudent[] students = new PgStudent[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name:");
            String name = s.next();
            System.out.println("Enter gender:");
            String gender = s.next();
            System.out.println("Enter phone number:");
            long phnno = s.nextLong(); // Changed to nextLong
            System.out.println("Enter course:");
            String course = s.next();
            System.out.println("Enter score:");
            float score = s.nextFloat();
            System.out.println("Enter research area:");
            String researchArea = s.next();
            System.out.println("Enter grade:");
            String grade = s.next();

            students[i] = new PgStudent(name, gender, phnno, course, score, researchArea, grade);
        }

        
        Arrays.sort(students, new ScoreComparator());

        System.out.println("\nStudents ranked by score:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nRank " + (i + 1) + ":");
            students[i].display();
        }

        
        Arrays.sort(students, new ResearchAreaComparator());

        System.out.println("\nStudents sorted by research area:");
        for (PgStudent student : students) {
            student.display();
            System.out.println();
        }

        s.close();
    }
}

class ScoreComparator implements Comparator<PgStudent> {
    @Override
    public int compare(PgStudent s1, PgStudent s2) {
        return Float.compare(s2.score, s1.score);
    }
}


class ResearchAreaComparator implements Comparator<PgStudent> {
    @Override
    public int compare(PgStudent s1, PgStudent s2) {
        return s1.researchArea.compareTo(s2.researchArea);
    }
}
