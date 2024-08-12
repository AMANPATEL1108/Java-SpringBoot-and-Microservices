
class Student {
    int rollno;
    String name;
    int marks;
}

public class Arr {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "aman";
        s1.marks = 67;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "aman";
        s2.marks = 68;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "aman";
        s3.marks = 69;

        // System.out.println(s1.name + " " + s1.rollno + " " + s1.marks);

        Student student[] = new Student[3];

        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for (int i = 0; i < student.length; i++) {
        // System.out.println(student[i].name + " "+student[i].rollno+"
        // "+student[i].marks);
        // }

        for (Student stud : student) {
            System.out.println(stud.name + " " + stud.marks + " " + stud.rollno);
        }
    }
}
