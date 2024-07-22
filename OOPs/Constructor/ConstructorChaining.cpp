#include<bits/stdc++.h>
using namespace std;

class Parent{
  public:
  Parent(){
    cout<<"Parent constructor"<<endl;
  }
  ~Parent(){
    cout<<"Parent Destructor"<<endl;
  }
};

class Child : public Parent {
  public:
  Child() {
    cout<<"Child constructor"<<endl;
  }
  ~Child() {
    cout<<"Child Destructor"<<endl;
  }
};

class GrandChild : Child  {
  public:
  GrandChild() {
    cout<<"GrandChild constructor"<<endl;
  }
  ~GrandChild() {
    cout<<"GrandChild Destructor"<<endl;
  }
};

int main()
{
  GrandChild c;

  return 0;
}

