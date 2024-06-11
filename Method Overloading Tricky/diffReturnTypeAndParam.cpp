#include<bits/stdc++.h>
using namespace std;

class MethodOverloading{
  public: 

  void overloadedMethod(){
    cout << "Method - 1" << endl;
  }

  /*
    * Overloaded function, different parameter list
    * Return type doesn't affect because parameter list is different
   */
  int overloadedMethod(int n){
    cout << "This is ALSO Function overloading, because parameter list is different but name is same! And the return type doesn't affect the overloading." << endl;
    return 1;
  }

};

int main()
{
  MethodOverloading om;
  om.overloadedMethod(6);
  return 0;
}