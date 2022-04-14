package example.General;

public class DiffWayOfCreatingObject implements Cloneable {
    int a = 10;
    String str = "Rohan";

    public static void main(String[] args) throws Exception {
        //1.Using New
        //2.Using CLASS.ForName
        //Class.forName("Fully Qualified Name").newInstance();
        DiffWayOfCreatingObject ob = (DiffWayOfCreatingObject) Class.forName("example.General.DiffWayOfCreatingObject").newInstance();
        System.out.println(ob.str);
        /*3. Clone Method
        Whenever clone() is called on any object,
        the JVM actually creates a new object and copies all content of the previous object into it.
        Creating an object using the clone method does not invoke any constructor.
        To use clone() method on an object we need to implement Cloneable and define the clone() method in it.*/
        DiffWayOfCreatingObject ob2 = (DiffWayOfCreatingObject) ob.clone();
        System.out.println(ob2.str);
    }
}
