/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
import java.util.Scanner;
public class MainClass {

 public static void main(String[] args) {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of Student class

                // Todo 7: Create two classes for com.mycompany.csc325_oop_designreview_lab.Freshman and Senior

                // ToDo 8: The senior class should have a minimum of 85 credits  

		// ToDo 7: Add a toString method for Student class
		// ToDo 9: Add a toString method for com.mycompany.csc325_oop_designreview_lab.Freshman class

		Student std1= new Student("James", 20);
                // ToDo 10: Add a toString method for Senior class

		Freshman std2= new Freshman("James", 20, 12); // name, age, credits

                Senior std3 = new Senior("John", 30, 90);

		// ToDo 8: Set the gpa of the student using the scanner and user
	 Scanner scnr = new Scanner(System.in);

	 System.out.println("What is your gpa?");
	 int gpa = scnr.nextInt();
	 std1.setGpa(gpa);

	 System.out.println("What is your gpa?");
	 int gpa2 = scnr.nextInt();
	 std2.setGpa(gpa2);
		// ToDo 11: Set the gpa of the student using the scanner and user
		// 			input and then print the output.

		System.out.println(std1);

                System.out.println(std2);

	 System.out.println(std3);

		// ToDo 9: add comments and explain your code
		// ToDo 12: add comments and explain your code

		// ToDo 10: submit using a pull request.
		// ToDo 13: submit using a pull request.
	}

}

