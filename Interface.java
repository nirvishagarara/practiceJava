// Interface
interface Animal {
//   public void animalSound(); // interface method (does not have a body)
//   public void sleep(); // interface method (does not have a body)
//   public void color();
     abstract public void printName();
}

// Pig "implements" the Animal interface




class Interface implements Animal {
  int age;
  String name;

      public void printName() {
        System.out.println("name is " +name);
        System.out.println("age is " +age);
    }
  public static void main(String[] args) {
    Interface myPig = new Interface();  // Create a Pig object
    myPig.name = "parth";
    myPig.age = 6;
    myPig.printName();

  }
}