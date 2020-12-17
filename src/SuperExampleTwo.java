class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void info(){
        System.out.println("Name    : "+name);
        System.out.println("Address : "+address);
    }
}

class Employee extends Person {
   
    private String desg;
    private int sal;
    
    public Employee(String name, String address, String desg, int sal){
        super(name,address);
        this.desg=desg;
        this.sal=sal;
    }
    public void info(){
        super.info();
        System.out.println("Desg.   : "+desg);
        System.out.println("Salary  : "+sal);
        System.out.println("_________________________________________________________");
    }
}

public class SuperExampleTwo {
    public static void main(String[] args) {
        Employee emp1=new Employee("Abc","Indore","Manager",50000);
        emp1.info();
        
        Employee emp2=new Employee("Xyz","Mumbai","AstMgr",35000);
        emp2.info();
    }
}
