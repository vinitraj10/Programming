#include <iostream>

using namespace std;

class VinitClass{
	public:
		void saying(){
			cout << "This is a class based function!" << endl;
		}
};

int main(){
	VinitClass object ;
	object.saying();
	return 0;
}
