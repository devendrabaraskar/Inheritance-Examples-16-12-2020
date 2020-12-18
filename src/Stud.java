
public  abstract class Stud {
    int rno;
    String name;
    final int PASSING_MARKS=33;

    public String toString() {
        return "Stud{" + "rno=" + rno + ", name=" + name + '}';
    }
    
    public abstract void result(int marks);
    
    public void setPerData(int rno, String name){
        this.rno=rno; this.name=name;
    }
    public void showPerData(){
        System.out.println(rno+","+name);
    }
    public static void main(String[] args) {
        System.out.println("testing successs...");
    }
}
