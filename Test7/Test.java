class Test{
    int a; 
    double b;
    String c;

    private Test(){
        a=10; b =25.65; c = "Sachin";
        System.out.println("a"+" "+b+" "+c);
    }
    public static void main(String args[]){
        Test p = new Test();
    }
}