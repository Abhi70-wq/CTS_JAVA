// use of super keyword
class SUPER{
    public void display(){
    System.out.println("Parent class method");
    }
}
class SUB extends SUPER{
    @Override
    public void display(){
        super.display();
        System.out.println("class class method");
    }
}
public class SUPER_KEYWORD {
    public static void main(String[] args) {
        SUB sb=new SUB();
        sb.display();
    }
}
