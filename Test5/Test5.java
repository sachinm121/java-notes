class ParaCon{
    int x,y;

    ParaCon(int a, int b){
        x = a;
        y = b;
    }

    void show(){
        System.out.println(x+" "+y);
    }
}

class Test{
    public static void main(String[] args) {
        ParaCon p = new ParaCon(10, 20);
        p.show();
    }
}