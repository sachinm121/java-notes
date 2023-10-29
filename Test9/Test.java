// Static 
class Test{

    public static void main(String[] args) {
        Test t = new Test();
    }
    Test(){
        System.out.println("I am a constructor");
    }
    static{
        System.out.println("I am static block");
    }
    {
        System.out.println("I am instance block");
    }
}