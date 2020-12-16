public class MediStud extends Stud {
    String spec;
    int prof;
    /*
    public void result(int marks){
        if(marks>=50){
            System.out.println("Medical Student Passed...");
        }else{
            System.out.println("Medical Student Failed...");
        }
    }
*/
    public void setMedData(String spec, int prof){
        this.spec=spec; this.prof=prof;
    }
    public void showMedData(){
        System.out.println(spec+","+prof);
    }
}
