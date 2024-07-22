abstract class KFC {
  private String name;

  // * This is called implicitly by the sub classes only.
  KFC(String name) {
      this.name = name;
      System.out.println("KFC at : " + name);
  }

  public String getName() {
      return name;
  }

  abstract String openingHours();
  abstract String closingHours();

  void billCalculation(){
    System.out.println("Add Restaurant Charges depending on the area");
  }
}

class Outlet1 extends KFC {
  Outlet1(String name) {
      // Calling the constructor of the abstract class
      super(name);
      System.out.println("Outlet 1's constructor: " + name);
  }

  void openingOffer() {
      System.out.println("50% discount for 1st 1000 customers!!");
  }

  @Override
  String openingHours(){
    return "10AM";
  }
  
  @Override
  String closingHours(){
    return "11PM";
  }
}

public class Abstraction {
  public static void main(String[] args) {
    Outlet1 ot = new Outlet1("Tower Square, Indore");
    ot.getName();
    ot.openingOffer();
  }
}