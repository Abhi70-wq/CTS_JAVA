

interface   Interface_oops{
     void display1();
}
class INHERIT{
    public void display(){
        System.out.println("Inheritance");
    }
}
class first extends INHERIT implements Interface_oops{
    public void display(){
        System.out.println(" inheritated class");
    }
    @Override
    public void display1(){
        System.out.println("Inheritance and abstraction");
    }
}
class second implements Interface_oops{
       @Override
    public void display1(){
        System.out.println("interface extends through @override");
    }
    
}
public class OOPS {
    public static void main(String args[]){
        INHERIT in=new INHERIT();
        in.display();
        first oo=new first();
        oo.display();
        oo.display1();
        second sen =new second();
        sen.display1();
    }
}
