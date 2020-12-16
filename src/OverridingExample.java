class A{                //parent 
    int data=100;
    void info(){
        System.out.println("Info From Parent...");
    }
}
class B extends A {     //Child
    
    //int data=200;
    void info(){
        System.out.println("Info From Child...");
    }
    void show(){
        //System.out.println(super.data); //data member of parent
        //System.out.println(data);       //data member of child itself
        info();
        super.info();
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        B ob=new B();
        ob.show();
                
    }
}
