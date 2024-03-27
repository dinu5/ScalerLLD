package Design.patterns.prototype;

public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(Student student){
        super(student);
        this.iq = 99;
    }
    public IntelligentStudent(){

    }
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

}
