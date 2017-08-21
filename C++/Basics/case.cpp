#include <iostream>
#include <string>
using namespace std;
int main(){
	string s;
	cout << "Enter a string :- " <<endl;
	getline(cin,s);
	//uppercase
	
	for(int i=0;i<s.size();i++){
		if(s[i]>=97 && s[i]<=122)
			s[i]=s[i]-32;
	}
	cout<<"The Uppercase String:- " <<s <<endl;
	//lowercase
	for(int i=0;i<s.size();i++){
		if(s[i]>=65 && s[i]<=90)
			s[i]=s[i]+32;
	}
	cout<<"The Lowercased String:- "<<s<<endl;
	return 0;
} 