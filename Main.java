public class Main {
    public static void main(String[] args){
        Student s1=new Student();
        s1.age=12; // public variable 
        //s1.name="Lindani"; //cannot acces a private 'name'
        s1.setName("Lindani"); // using a setter
        s1.getName(); //getter to access the value for private 'name'
        System.out.println(s1.getName()); //getter to access the value for private 'name'

        //polymorphism => methods behave differently depending on the class that uses them 
        Parent p1=new Parent();
        p1.greet();
        s1.greet();
    }
}

class Student{
    private String name; //encapsulation
    int age;

    public String getName(){ //getter => access a private variable
        return name;
    }
    public void setName(String name){ //setter => allows you to change the value
        this.name=name;
    }

    public void greet(){
        System.out.println("Hello from student class");
    }
}

class Parent{
    public void greet(){
        System.out.println("Hello from Parent class");
    }
}