public class HelloWorld {
  public static void main(String[] args) {
    Person abc = new Person();
    // String yyyy = abc.name;

    Person parth = new Person("nishu",28);
    Person nishu = new Person("parth",28); 

    int result = nishu.add(5, 7);
    
    String fullname = nishu.add("Nishu", "garara");

    System.out.println("Population " + Person.population);

  }

  static void callme(){
    System.out.println("Population");
  }
}

