package practice11;

public class Student extends Person {

    private Klass klass;

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if("Tom".equals(this.getName()) &&
                this.equals(this.klass.getLeader())){
            return super.introduce()+" I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        }else{
            return super.introduce()+" I am a Student. I am at Class "+this.klass.getNumber()+".";
        }
    }
}
