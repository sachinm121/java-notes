class Student{
    int roll,marks;
    String name;

    protected void input(){
        System.out.println("Enter rollno, name and marks");
    }
}

class Sachin extends Student{
    void display(){
        roll=59; name="sachin"; marks=59;
        System.out.println(roll+" "+name+" "+marks);
    }
}

class Test{
    public static void main(String args[]){
        Sachin s = new Sachin();
        s.input();
        s.display();
    }
}