
// * Multiple Inheritance using INTERFACES in JAVA

interface ParentInterface1 {
  // * Difference-1:  All memebers are by default public
  int a = 10; // * Difference-2: Variables must be initialized, as they're bydefault final

  // * Common Abstract method
  void fun();

  // * Common Concrete method
  default void defaultMethod(){
    System.out.println("Default method of ParentInterface1");
  }
}

interface ParentInterface2 {

  // * Common Abstract method
  void fun();

  // * Common Concrete method
  default void defaultMethod(){
    System.out.println("Default method of ParentInterface1");
  }

}

public class Main implements ParentInterface1, ParentInterface2 {
  
  // * Common ABSTRACT method overriden for both interfaces 
  public void fun() {
    System.out.println("fun()");
  }

  
  // * Common DEFAULT Method also OVerrident for both interfaces.
  public void defaultMethod(){
    System.out.println("Default method of MultipleInheritance");
  }
  
  public void defaultOfPI1(){
    ParentInterface1.super.defaultMethod();
  }

  public void defaultOfPI2(){
    ParentInterface2.super.defaultMethod();
  }

  public static void main(String[] args) {
    Main obj = new Main();
    obj.fun();
    obj.defaultMethod();
    
  }
}
