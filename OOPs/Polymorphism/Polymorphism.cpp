#include<bits/stdc++.h>
using namespace std;

class Parent {
  public:
  void fun1(){
    cout << "Parent::fun1()" << endl;
  }

  // * Make it virtual so that its shadowed by the sub class's function
  virtual void fun2(){
    cout << "Parent::fun2()" << endl;
  }

  void method1(){
    cout << "Method 1 of parent" << endl;
  }
};

class Child : public Parent {
  public:
  void fun2(){
    cout << "Child::fun2()" << endl;
  }

  int method1(){
    cout << "fn of child";
    return 1;
  }
};

int main()
{
  int a;
  Parent *p = new Parent;
  p->fun1();
  p->fun2();
  // p->method1();
  Child *c = new Child;
  c->method1();
  // p->fun3();


  return 0;
}