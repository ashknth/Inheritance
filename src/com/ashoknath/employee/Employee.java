package com.ashoknath.employee;

/**
 * Created by DELL on 2/1/2019.
 */
public class Employee {
    int id;
    Intro name;


    public Employee(int id,Intro name)
    {
       this.id=id;
        this.name=name;

    }



    public void Display()
    {
        System.out.println("id::"+id+"\nFirst_name::"+name.first_name+"\nMiddle_name::"+name.middle_name+"\nLast_name::"+name.middle_name);
    }
    public static void main(String[] args) {
        Intro intro=new Intro("Ashok","Nath","Yogi");
      Employee employee=new Employee(171204,intro) ;
        employee.Display();

    }

}
