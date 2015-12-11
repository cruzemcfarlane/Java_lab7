package Lab7;


/**
 * @author Cruze McFarlane 
 * @ID No 620040546
 */

public class Student implements Person
{
    protected String lastName;
    protected String firstName;
    protected int id;
    protected double gpa;
    
    public Student(String lastName, String firstName, int id)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        gpa = 0;
    }
    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
       
    public String getLastName()
    {
        return lastName;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public String toString()
    {
        return "Last Name: " + lastName
               + "\nFirst Name: " + firstName
               + "\nID:\t" + id
               + "\nGPA:\t" + gpa;
    }
    
    public void calculateGPA(int grade)
    {
        gpa = (grade/100.0)*4;
    }
    
    
    
    
}