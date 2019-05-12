class Person {
    static int population;
    int age;
    // double bankBalance;
    String name;

    Person(String namme, int age) {
        name = namme;
        this.age = age;
        population++;
        staticCallme();
    }

    int add(int a, int b) {
        return a+b;
    }

    String add(String aa, String bb){
        return aa+bb;
    }

    static void staticCallme() {
        System.out.println("Calling ");
    }
}