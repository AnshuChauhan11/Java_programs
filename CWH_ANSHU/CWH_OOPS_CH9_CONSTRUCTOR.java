package COM.CWH_ANSHU;

class myEmployee{
    private int id;
    private String name;

                                    // CREATE THE CONSTRUCTOR IN JAVA

                                       /*
                                        The constructor automatic invoke
                                         */

                 // NO ANY RETURN VALUE OF THIS METHOD

//    public myEmployee(){
//        id=33;
//        name="Your-name<hare>";
//    }



                 // WE CAN PASS THE ARGUMENT IN CONSTRUCTOR
public myEmployee(String newName,int num){
    id=num;
    name=newName;

}

    public String getName(){return name;}
    public void setName(String n){this.name=n;}
    public void setId(int i){this.id=i;}
    public int getId(){return id;}
}

public class CWH_OOPS_CH9_CONSTRUCTOR {
    public static void main(String[] args) {
        myEmployee em=new myEmployee("codingWithTeam",87);
//        em.setId(55);
//        em.setName("codeWithAnshu");
        System.out.println(em.getId());
        System.out.println(em.getName());
    }
}
