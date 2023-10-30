class Block{

    int b = 10;
    static int c = 50;
    Block(){
        System.out.println("I am a constructor");
    }
    
    {// Instance variable
        System.out.println("I am a instance block");
        System.out.println(b +" "+ c);
    }
    
    static{//Static variable
        System.out.println("I am static block");
        // System.out.println(b +" "+ c);//It will throw an error becuase it does not use non-statoc variable
    }
}

class Test{
    public static void main(String arg[]){
        Block b = new Block();
    }
}