package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

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
        if(!this.isIn(student)){
            System.out.print("It is not one of us.\n");
            return;
        }
        this.leader = student;
        if(teacher != null)  {
            teacher.printLeader(this);
        }
    }

    public void appendMember(Student student){
        student.setInKlass(true);
        if(teacher != null)  {
            teacher.printJoin(this);
        }
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean isIn(Student student){
        return student.isInKlass();
    }
}
