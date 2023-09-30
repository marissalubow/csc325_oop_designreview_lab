/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public abstract class Human {
    private String name;
	protected String address;
	private int age;

	/**
	 *
	 * default constructor
	 */
	 Human()
	{
		this.name = "name";
		this.age = 0;
	}

	/**
	 *paramerterized constructor
	 */
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * get method for name
	 */
	public String getName() {
		return name;
	}

	/**
	 * set method for name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * abstract method for get address
	 */
	public abstract String getAddress();

	/**
	 * abstract method for set address
	 */
	public abstract void setAddress(String address);

   /**
	* get method for age
    */
	public int getAge() {
		return age;
	}

	/**
	 * set method for age
	 */
	public void setAge(int age) {
		this.age = age;
	}
}