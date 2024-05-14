
/*
 * Even though, interface help us achieve multiple inheritance 
 * what happens when we have two methods with same name?
 * When we have methods with SAME Signatures in two interfaces implemented by a class.
 */

 // * Parent interface 1
interface PI1 {
  default void fun(){
    System.out.println("Fun of Parent Interface - 1");
  }

  // * By default, the method is PUBLIC
  // * Methods in interfaces can only have : static, public, and default MODIFIERS  
  void fun2();

  // * We need to provide a body for static methods inside interfaces in java
  static void staticMethod() {
    System.out.println("I am a static method, I CANNOT be abstract");
  }
}

// * Parent interaface 2
interface PI2 {
  default void fun(){
    System.out.println("Fun of Parent Interface - 2");
  }
  void fun2();
}

public class multipleInheritance implements PI1, PI2 {

  // * Calling both the methods using the interfaceName.super.methodName()
  public void fun() {
    PI1.super.fun();
    PI2.super.fun();
  }

  // * The implementing class is required to give a common implementation for method defined in both interfaces
  @Override
  public void fun2(){
    System.out.println("Overriden methods");
  }

  public static void main(String args[]){
      multipleInheritance mi = new multipleInheritance();
      mi.fun();

      // * Static methods can ONLY be called with interface's name
      PI1.staticMethod();
  }
}