package practice03;

public class Student extends Person{
    int klass;
    public int getKlass() {return klass;}
    public Student(){}
    public Student(String name,int age,int klass)
    {
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    String introduce()
    {
        String str="I am a Student."+" I am at Class " + klass+".";
        return str;
    }
}
