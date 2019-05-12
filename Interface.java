// Interface
interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void sleep(); // interface method (does not have a body)
//   public void color();
     int age;
     String name;
    

     abstract void printName();
}

// Pig "implements" the Animal interface
class Pig implements Animal {

      void printName() {
        System.out.println("name is " +name);
        System.out.println("age is " +age);
    }
}



class Interface extends Animal {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // Create a Pig object
    myPig.name = "parth";
    
    myPig.age = 6;
    myPig.printName();

  }
}