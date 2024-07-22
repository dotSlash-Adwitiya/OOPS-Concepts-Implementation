#include<bits/stdc++.h>
using namespace std;

// * General Standards are provided
// * KFC example
class Shape {
  // * Why length and Breadth not here?
  public:
    virtual double findArea() = 0;
};


class Rectangle : public Shape{
  public:
    int length, breadth;
    
    Rectangle(int l, int b) {
      this->length = l;
      this->breadth = b;
    }
    
    double findArea() {
      return length * breadth;
    }

    // * Following Standards + Adding new Functionalities.
    // * Example: While designing an Application, you might have 2 or more types of users
    // * User will have some common attributes(Properties) which are called standards.
    int getLength(){
      return length;
    }

    int getBreadth(){
      return length;
    }
};

class Triangle : public Shape {
  public:
  int base, height;

  Triangle(int b, int h) {
    this->base = b;
    this->height = h;
  }

  double findArea() {
    // * Will not work. 
    return 0.5 * base * height;
  }
};

// * By default becomes abstract, because not overriding the abstract function
// * Hence, its object can't be created.
class Circle : public Shape {
  public:
    Circle() {
      cout << "Circle" << endl;
    }
    void shapeName(){
      cout << "Circle Class" << endl;
    }
};

int main()
{
  // * DRAW The Memory Area Diagram
  Shape *s1 = new Rectangle(10, 20);
  Shape *s2 = new Triangle(10, 20);

  cout << s1->findArea() << endl;
  cout << s2->findArea() << endl;

  // * Will Cause Compiler Error
  // Circle c;

  return 0;
}