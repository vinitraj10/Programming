#include <iostream>
#include <string>
using namespace std;

int main( )
{
    string str1,str2;
	
    cout<<"Enter first string: ";
    getline(cin,str1);
	
    cout<<"Enter second string: ";
    getline(cin,str2);

    int l = str2.size();

    int i, j;
    
    for(i = 0, j = 0; str1[i] != '\0' && str2[j] != '\0'; i++)
    {
        if(str1[i] == str2[j])
        {
            j++;
        }
        else
        {
            j = 0;
        }
    }

    if(j == l)
        cout<<"Substring found at position "<< i - j + 1;
    else
        cout<<"Substring not found";
	
    return 0;
}

