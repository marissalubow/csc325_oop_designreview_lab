package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student
{
    /**
     * default constructor
     */

    public Freshman()
    {
        super(" ",0,0);
    }

    /**
     * paramerterized constructor
     */
    public Freshman(String name, int age, int credits)
    {
        super(name,age,credits);
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
