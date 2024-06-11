#include<bits/stdc++.h>
using namespace std;

class MethodOverloading{
  void overloadedMethod(){
    cout << "Method - 1" << endl;
  }

  // * Below code will generate compiler error:
  // * cannot overload functions distinguished by return type alone
  int overloadedMethod(){
    cout << "Method - 1" << endl;
  }

};

int main()
{
  MethodOverloading om;
  om.overloadedMethod();
  return 0;
}