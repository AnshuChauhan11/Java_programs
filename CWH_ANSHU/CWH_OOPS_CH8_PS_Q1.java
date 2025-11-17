package COM.CWH_ANSHU;

import java.util.Scanner;

class employe{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class CWH_OOPS_CH8_PS_Q1 {
    public static void main(String[] args) {
        employe emp=new employe();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary = ");
        emp.salary=sc.nextInt();
        emp.setName("My name is Anshu chauhan ");
        System.out.println(emp.getName());
        System.out.println("The salary is = "+emp.getSalary());
    }
}
