package Lab7;

/**
 * @author Cruze McFarlane 
 * @ID No 620040546
 */

public class StudentTest
{
    public static void main(String[] args)    {
        Student student;
        UniversityStudent uniStudent;
        
        student = new Student("McFarlane", "Cruze", 620040546);
        uniStudent = new UniversityStudent("McFarlane", "Cruze", 620040546, 15, 5);
        System.out.println(student.toString());
        System.out.println(uniStudent.toString());
        
        System.out.println("\n");
        
        student.calculateGPA(90);
        uniStudent.calculateGPA();
        
        System.out.println(student.toString());
        System.out.println(uniStudent.toString());
    }
}