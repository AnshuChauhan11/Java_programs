package COM.CWH_ANSHU;

class emp_1 {
    private int salary;

    // CREATE THE CONSTRUCTOR

    public emp_1() {
     salary=76000;
    }


    // USE GETTER & SETTER
    public int getSalary() {
        return salary;
    }

    public void setSalary(int i) {
        this.salary = i;
    }
}


public class CWH_OOPS_CH9_CONSTRUCTOR_QUIZ_1 {
    public static void main(String[] args) {
        emp_1 ep=new emp_1();
        System.out.println(ep.getSalary());
    }
}
