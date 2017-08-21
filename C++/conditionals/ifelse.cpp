#include <iostream>

using namespace std;

//In this program we will determine that which one is greatest
int main(){
	int a,b,c;
	cout << "Enter the value of a ,b c respectively:-" << endl;
	cin >> a >> b >> c;
	if (a>b && a>c)
		cout << "A is greatest";
	
	else if ( b >a && b>c)
		cout << "B is greatest";
	else
		cout << "C is greatest";
 	
 	return 0;
}