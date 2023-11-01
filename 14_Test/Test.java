import java.util.Scanner;;
class Operation1{
    int a,b,c;

    void add (){
        a=20;b=40;
        c=a+b;
        System.out.println("Sum of two Numbers:"+c);
    }
    void sub (){
        a=200;b=80;
        c=a-b;
        System.out.println("Sub of two Numbers:"+c);
    }
}

class Operation2 extends Operation1{
    void mul (){
        a=6;b=36;
        c=a*b;
        System.out.println("Multiply of two Numbers:"+c);
    }
    void div (){
        a=36;b=6;
        c=a/b;
        System.out.println("Divide of two Numbers:"+c);
    }

}
class Operations extends Operation2{
    void rem(){
        a=10;b=3;
        c=a%b;
        System.out.println("Remainder of two Numbers:"+c);
    }
}

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operations op = new Operations();

        boolean flag = true;
        while(flag){
            System.out.println("Choose operation");
            System.out.println("1. Add two Numbers");
            System.out.println("2. Sub two Numbers");
            System.out.println("3. Multiply two Numbers");
            System.out.println("4. Divide two Numbers");
            System.out.println("5. Remainder two Numbers");
            System.out.println("6. Exit");
            
            System.out.print("Enetr your choice: ");
            int choice = sc.nextInt();
    
            switch (choice) {
                case 1:
                    op.add();
                    break;
                case 2:
                    op.sub();
                    break;
                case 3:
                    op.mul();
                    break;
                case 4:
                    op.div();
                    break;
                case 5:
                    op.rem();
                    break;
            
                default:
                    flag = false;
                    break;
            }
        }
    }
}