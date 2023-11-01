class A{
    void input(){
        System.out.println("Enter your name: ");
    }
}
class B extends A{
    void display(){
        System.out.println("My name is sachin");
    }
}
class C extends A{
    void show(){
        System.out.println("My name is divesh");
    }
}

class Test{
    public static void main(String[] args) {
        B b = new B();
        C c = new C();

        b.input();
        b.display();
        b.input();
        c.show();
    }
}