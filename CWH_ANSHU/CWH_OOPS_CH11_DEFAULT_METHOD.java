package COM.CWH_ANSHU;


interface myCamera{
    void pickSnap();
    void recordVideo();
   default  void record4kVideo(){
        System.out.println("Record in 4k ");// THIS Method is not execute when the  method
                                            // is  implement in MySmartPhone class
    }
}

interface  myWifi{
    String [] getNetwork();
    void connectTONetwork(String network);
}
// CREATING THE CLASS OF CELLPHONE
class  myCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling.."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting............");
    }
}
// CREATING THE CLASS OF SMARTPHONE
class mySmartPhone extends  myCellPhone implements myCamera,myWifi{
        // IMPLEMENT THE PICK SNAP METHOD
         public void pickSnap(){
             System.out.println("Piking Snap ............");
         }
         // IMPLEMENTING THE RECORDED METHOD
         public void recordVideo(){
             System.out.println("Recording Video ............");
         }
         // IMPLEMENTING THE RECORD4kVIDEO METHOD
         public  void record4kVideo(){
             System.out.println("Taking snap and Record in 4k ");// THIS Method is not execute when the  method
             // is  implement in MySmartPhone class
         }
         // IMPLEMENT THE GET NETWORK METHOD
         public String [] getNetwork(){
             System.out.println("getting list of network ");
             String  [] networkList={"anshu","Alok","Harry"};
             return networkList;
         }
        // IMPLEMENT THE CONNECT TO NETWORK METHOD
         public void connectTONetwork(String  network){
             System.out.println("Connecting to "+network);
         }
}

public class CWH_OOPS_CH11_DEFAULT_METHOD {
    public static void main(String[] args) {

                mySmartPhone ms=new mySmartPhone();
                String [] ar=ms.getNetwork();
                ms.record4kVideo();
                for(String item:ar){
                    System.out.println(item);
                }

                ms.recordVideo();
                ms.pickSnap();
                ms.pickCall();
    }
}
