// runtime Polymorphism
/*
class Animal
{
    public void sound()
    {
        System.out.println("Animal is making sound");
    }
}

class Cat extends Animal
{
    public void sound()
    {
        System.out.println("Meao.");
    }
}

class Polymorphism
{
    public static void main(String args[])
    {
        Cat ct = new Cat();
        ct.sound();
    }
}
*/

//Compiletime polymorphism

class Polymorphism
{
    public void math(int a)
    {
        System.out.println("a is " +a);
    }

    public void math(int a, int b)
    {
        System.out.println("a and b is " +a +b);
    }

    public void math(char a)
    {
        System.out.println("Char a is " +a);
    }

    public static void main(String args[])
    {
        Polymorphism ph = new Polymorphism();
        ph.math(10);
        ph.math(10,20);
        ph.math('A');
    }
}