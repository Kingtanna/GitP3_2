package practice08;

public class Teacher extends Person{
    Klass klass;
    public String getName(){return name;}
    public int getAge(){return age;}
    public Klass getKlass() {return klass;}
    public Teacher(){}
    public Teacher(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public Teacher(int id,String name,int age,Klass klass)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.klass=klass;
    }
    public Teacher(int id,String name)
    {
        this.name=name;
        this.age=age;
        //  this.klass=klass;
    }


    String introduce() {
        //String str="My name is "+name+"."+" I am "+age+" years old. I am a Student. I am at Class "+klass+".";

        if(klass==null)
        {
            return this.PersoniItroduce()+" I am a Teacher. I teach No Class.";
        }else {
            String str = this.PersoniItroduce() + " I am a Teacher. I teach Class " + klass.number + ".";
            return str;
        }
    }
    String introduceWith(Student student)
    {
        if(student.klass.number==klass.number)
        {
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";
        }else {
            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";
        }
    }
}
