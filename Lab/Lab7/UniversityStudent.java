package Lab7;

/**
 * @author Cruze McFarlane 
 * @ID No 620040546
 */

public class UniversityStudent extends Student
{
    private int credit;
    private int course;
    
    public UniversityStudent(String firstName, String lastName, int id, int credit, int course)
    {
        super(firstName, lastName, id);
        this.credit = credit;
        this.course = course;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    public void setCourse(int course)
    {
        this.course = course;
    }
    
    public int getCredit()
    {
        return credit;
    }
    
    public int getCourse()
    {
        return course;
    }
    
    public String toString()
    {
        return "Credit:\t" + credit
               + "\nCourse:\t" + course;
    }
    
    public void calculateGPA()
    {
        gpa = credit / course;
    }    
}