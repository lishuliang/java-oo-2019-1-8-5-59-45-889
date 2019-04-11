package practice09;

public class Klass {
    private int number;
    private Student leader;
    private boolean isNumber = false;

    public Klass(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName(){
        return "Class " + this.number;
    }

    public Student getLeader() {
        return this.leader;
    }

    public void assignLeader(Student student){
        if(!isNumber){
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
    }

    public void appendMember(Student student){
        this.isNumber = true;
    }
}
