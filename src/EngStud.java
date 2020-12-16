public class EngStud extends Stud {
    String branch;
    int sem;
    
    public void setEngData(String branch, int sem){
        this.branch=branch; this.sem=sem;
    }
    public void showEngData(){
        System.out.println(branch+","+sem);
    }
    
    
}

