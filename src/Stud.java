
public  class Stud {
    int rno;
    String name;
    final int PASSING_MARKS=33;

    public String toString() {
        return "Stud{" + "rno=" + rno + ", name=" + name + '}';
    }
    
   
    public  void result(int marks){
        //PASSING_MARKS++;
        if(marks>=PASSING_MARKS){
            System.out.println("Student Passed...");
        }else{
            System.out.println("Student Failed...");
        }
    }
    public void setPerData(int rno, String name){
        this.rno=rno; this.name=name;
    }
    public void showPerData(){
        System.out.println(rno+","+name);
    }
}
