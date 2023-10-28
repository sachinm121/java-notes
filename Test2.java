class Demo2{
    int age = 25;
    String name = "Sachin";

    void Show(){
        System.out.println("Name is "+name+" and age is "+age);
    }
}

class Test2{
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.Show();
    }
}