class DefaultCon {
    int a; String b; boolean c;

    DefaultCon(){
        a = 100;
        b = "Sachin";
        c = true;
    }

    void display(){
        System.out.println(a+" "+b+" "+c);
    }
}

/**
 * Test3
 */
public class Test4 {

    public static void main(String[] args) {
        DefaultCon d = new DefaultCon();
        d.display();
    }
}