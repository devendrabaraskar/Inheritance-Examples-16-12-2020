public class EngStud extends Stud {
    String branch;
    int sem;
    
    public void setEngData(String branch, int sem){
        this.branch=branch; this.sem=sem;
    }
    public void showEngData(){
        System.out.println(branch+","+sem);
    }

    
    public void result(int marks) {
        if(marks>=40){
            System.out.println("EngStud Passed...");
        }else{
            System.out.println("EngStud Failed...");
        }
    }
    
    
}

