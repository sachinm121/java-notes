class Overl{

    int a; double b; String c;
    Overl(){
        a=10; b=65.25; c="Sachin";
        System.out.println(a + " " + b + " " + c);
    }
    Overl(int x){
        a=x; b=45.01; c="divesh";
        System.out.println(a + " " + b + " " + c);
    }
    Overl(double d){
        a=45; b=d; c="Raju";
        System.out.println(a + " " + b + " " + c);
    }
}

class Test{
    public static void main(String[] args) {
        Overl o = new Overl(5);
    }
}