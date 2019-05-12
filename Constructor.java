class Constructor{

    private char ch;

    public static void main(String args[]){

        Constructor obj1 = new Constructor('b');
        Constructor obj2 = new Constructor(obj1);

       obj1.example();
       obj2.example();

    }

    public Constructor(char n){
        ch = n;
    }

    public Constructor(Constructor cc){
        ch = cc.ch;
    }

    public void example(){
        System.out.println("alphabet  " +ch);
    }
}