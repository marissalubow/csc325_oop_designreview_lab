package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student
{

    /**
     *default constructor
     */
    public Senior()
    {
        super("",0,0);
    }

    /**
     *paramerterized constructor
     */
    public Senior(String name, int age, int credits)
    {
       super(name,age,credits);
       if(credits < 85)
           System.out.println("Seniors must have 85 credits");
    }

    /**
     *override of toString method
     */
    @Override
    public String toString()
    {
        return ("Name: " + this.getName() + " Age: " + this.getAge()+ " Address: " + this.getAddress() + " GPA: " + this.getGpa() + " Credits: " + this.getCredits());
    }
}
