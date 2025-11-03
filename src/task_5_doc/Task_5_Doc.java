package task_5_doc;

import java.util.Scanner;

public class Task_5_Doc 
{

    public static void main(String[] args) 
    {
        System.out.println(UI.Yellow+"--- Doctor Class Demonstration (OOP) ---\n");

        Doctor dr_ahmed = new Doctor("Ahmed Zaki", "Cardiology", 150000.0);
        
        System.out.println(UI.Green+"--- Creating Doctor 1 (Custom Constructor) ---");
        System.out.println(UI.Green+"ID: " + dr_ahmed.getId()); 
        System.out.println(UI.Green+"Name: " + dr_ahmed.getName());
        System.out.println(UI.Green+"Salary: " + dr_ahmed.getSalary() + "$\n");
        
        
        System.out.println(UI.Yellow+"--- Applying Encapsulation (Setters) ---");
        
        dr_ahmed.setSalary(165000.0);
        dr_ahmed.setSpecialization("Interventional Cardiology"); 
        
        
        dr_ahmed.setSalary(-500); 

        
        System.out.println(UI.Green+"New Salary after increase: " + dr_ahmed.getSalary());
        System.out.println(UI.Green+"New Specialization: " + dr_ahmed.getSpecialization());

        System.out.println(UI.Yellow+"--------------------------------------------------------------\n");
        
        Doctor dr_unknown = new Doctor();
        System.out.println(UI.Green+"--- Creating Doctor 2 (Default Constructor) ---");
        System.out.println(UI.Green+"ID: " + dr_unknown.getId());
        System.out.println(UI.Green+"Name (Default): " + dr_unknown.getName()+"\n");


        System.out.println(UI.Cyan+"--- Static Feature Demonstration ---");
        

        new Doctor(); 
        new Doctor(); 


        System.out.print(UI.Green+"Total Doctor objects created: ");
        System.out.println(UI.Red+Doctor.getCount());
        System.out.println(UI.Yellow+"---------------------------------------------------------------->>>>>>");
    }
    
}
