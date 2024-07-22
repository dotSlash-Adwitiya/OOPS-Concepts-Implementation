#include<bits/stdc++.h>
using namespace std;

class Base{

  public:
  int a;

  Base(){
    cout<<"Base constructor"<<endl;
  }

  // * Constructor Overloading
  Base(int n){
    this->a = n;
    cout<<"Parameterised Base constructor"<<endl;
  }

  Base(Base &base) {
    this->a = base.a;
    cout<<"Copy constructor"<<endl;
  }

  void fun(){
    cout << "fun of base" << endl;
  }
};

class Sub : public Base {
  public:
  Sub() {
    cout<<"Sub constructor"<<endl;
  }
  Sub(int n){
    cout<<"Parameterised Sub constructor"<<endl;
  }
};

int main()
{
  // Base b(10);

  // cout << b.a << endl;
  // b.fun();

  Base b1(100);

  Base b2(b1);
  cout << b2.a << endl;

  return 0;
}

