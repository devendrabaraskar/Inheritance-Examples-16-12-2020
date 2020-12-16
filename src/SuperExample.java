class P{
    P(){
        System.out.println("P-0");
    }
    P(int x){
        System.out.println("P-1");
    }
    P(int x, int y){
        System.out.println("P-2");
    }
}
class C extends P {
    C(){
        super(10);
        System.out.println("C-0");
    }
    C(int x){
        super(10,20);
        System.out.println("C-1");
    }
    C(int x, int y){
        //super();
        System.out.println("C-2");
    }
}
public class SuperExample {
    public static void main(String[] args) {
        C ob=new C(1,2);
    }
}
