#include <iostream>
using namespace std;
int main(){
	double si,amount,p,r,t;
	cout<< "Enter the p r and t" <<endl;
	cin >> p >>r >> t;
	si = p*r*t/100;
	amount=si+p;
	cout <<"The Interest is :- "<< si <<endl;
	cout <<"The Amount  is :- "<< amount;
	return 0;
}