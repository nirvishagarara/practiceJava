/*class Employee {

    private String name;
    private int level;

    protected String getName(){
        return name;
    }

    protected void setName(String name){
        this.name = name;
    }

    protected int getLevel(){
        return level;
    }

    protected void setLevel(int level){
        this.level = level;
    }

    void does() {

        System.out.println("Working");

    } 
}*/

class Parent {

    protected void overriding(){

        System.out.println("Mathod of parent class");
        
    }

    Parent(){
        System.out.println("constructor of parent");
    }
}

class Inheritance extends Parent {

    Inheritance(){
        System.out.println("constructor of child");
    }

    public void overriding(){

        System.out.println("Method of child class");
         super.overriding();

    }
     
    void newMethod(){
        System.out.println("New Method");
    }

    public static void main(String args[]){

       Inheritance hh = new Inheritance();
       hh.overriding();

      /*  Inheritance dd = new Inheritance();
        String nm = dd.getName();
        nm = "John";

        int lvl = dd.getLevel();
        lvl = 1;

        System.out.println("The director " +nm+ " with level " +lvl+ " directs the other employee.");
        dd.does();
        */

    }
}