package CollectorFramework;

class Emp{
    int id;
    String name;
    //static String orgName;
    String orgName;
//    static{
//        orgName="MI";
//    }
//    public Emp(int id, String name){
//        this.id=id;
//        this.name=name;
//    }
    public void printDetails(){
        System.out.println("id: "+id+" " + " Name: "+name+"; OrgName :"+orgName);
    }
}
public class Example {
    public static void main(String[] args) {
        Emp raghu=new Emp();//1
        Emp ravi=new Emp();//2

        raghu.printDetails();
        ravi.printDetails();
    }
}
