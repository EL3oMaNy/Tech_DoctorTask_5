package task_5_doc;

public class Doctor 
{
    private int id; 
    private String name;
    private String specialization;
    private double salary;
    private static int count = 0; 
    

    public Doctor() 
    {
        id = ++count; 
        name = "Unknown";
        specialization = "General";
        salary = 0.0;
    }

   public Doctor(String name, String specialization, double salary)
   {
        id = ++count;    
        this.name = name;
        this.specialization = specialization;
        this.salary = salary;
    }


    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getSpecialization() 
    {
        return specialization;
    }

    public double getSalary()
    {
        return salary;
    }


    public static int getCount()
    {
        return count;
    }


    
    public void setName(String name) 
    {
        if (name != "")
            this.name = name;
        else
            System.out.println(UI.Red+"Enter a Valid Name -_-");
        
    }

    public void setSpecialization(String specialization)
    {
        if (specialization != "")
            this.specialization = specialization;
        else
            System.out.println(UI.Red+"Enter a Valid specialization -_-");
    }

    public void setSalary(double salary) 
    {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println(UI.Red+"Traing negative salary -_-");
        
    }
}
