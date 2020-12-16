
public class ResultProcessing {

    public static void main(String[] args) {
           System.out.println("Details of EngStud");
           EngStud s1=new EngStud();
           s1.setPerData(111, "AAA");
           s1.setEngData("CS", 3);
           s1.showPerData();
           s1.showEngData();
           s1.result(40);
           System.out.println("_______________________________________________________________");
           System.out.println("Details of MediStud");
           MediStud s2=new MediStud();
           s2.setPerData(112,"BBB");
           s2.setMedData("Arth",2);
           s2.showPerData();
           s2.showMedData();
           s2.result(45);
           System.out.println("______________________________________________________________");
           Stud s=new Stud();
           s.setPerData(113, "CCC");
           String res=s.toString(); //this toString method Stud class is inheriting from Object
           System.out.println(res);
    }
}
