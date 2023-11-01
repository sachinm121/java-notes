class Instance{
    int a,b;

    static void show(){
        System.out.println("I am static method");
    }
    Instance(){
        a=10;b=20;
        System.out.println("Constructor");
        System.out.println(a+" "+b);
    }
    {
        a=40;b=70;
        System.out.println("Instance block");
        System.out.println(a+" "+b);
    }
}

class Test{
    public static void main(String[] args) {
        Instance.show();
        Instance i = new Instance();
    }
}