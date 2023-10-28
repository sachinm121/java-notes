class Con{
    
    int age;
    String name;

    Con(){
        age = 25;
        name = "Sachin";
    }
    void show(){
        System.out.println("Name is "+name+" and age is "+age);
    }
}

class Test{
    public static void main(String[] args) {
        Con c = new Con();
        c.show();
    }
}