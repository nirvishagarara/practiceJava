class One
 {

    public void add(char b, int a) 
    {
        System.out.println(b+ " and " +a);
    }

    public void add(int a, char b)
    {
        System.out.println(a+ " and " +b);
    }
}

class Overloading {

    

    public static void main(String args[])
    {

        One ov = new One();
        ov.add('a',1);
        ov.add(1,'a');
    }

}