// Copy constructor with default constructor 
// class CopyCon{
    //     int a;
    //     String b;
    //     CopyCon(){
//         a=10;
//         b="sachin";
//         System.out.println(a+" "+b);
//     }
//     CopyCon(CopyCon ref){
//         a=ref.a;
//         b=ref.b;
//         System.out.println(a+" "+b);
//     }
// }

// class Test{
//     public static void main(String[] args) {
//         CopyCon c = new CopyCon();
//         CopyCon c1 = new CopyCon(c);
//     }
// }

// Copy constructor with parameterized constructor 
class CopyCon{
    int a;
    String b;
    CopyCon(int x, String y){
        a=x;
        b=y;
        System.out.println(a+" "+b);
    }
    CopyCon(CopyCon ref){
        a=ref.a;
        b=ref.b;
        System.out.println(a+" "+b);
    }
}

class Test{
    public static void main(String[] args) {
        CopyCon c = new CopyCon(10, "Sachin");
        CopyCon c1 = new CopyCon(c);
    }
}