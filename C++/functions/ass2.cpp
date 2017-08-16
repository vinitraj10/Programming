#include <iostream>
using namespace std;

int** inputMatrix(int m,int n){
	int **temp = new int* [m];
		for(int i=0;i<m;i++){
			int *x = new int [n];
			temp[i] = x;
			for(int j=0;j<n;j++)
				cin>>x[j];  
		}
		return temp;
}
int ** createMatrix(int m,int n){
    int **temp = new int *[m];
        for(int i=0;i<m;i++){
            int *x = new int[n];
            temp[i]=x;
        }
    return temp;
}
int** multiply(int **p,int**q,int m1,int n1,int m2,int n2){
    int** answer = createMatrix(m1,n2);
    for(int i=0;i<m1;i++){
        for(int j=0;j<n2;j++){
            int sum=0;
            for(int k=0;k<m2;k++){
                sum += p[i][k]*q[k][j];
            }
            answer[i][j]=sum;
        } 
    
    }
    return answer;
    
} 

void displayMatrix(int m,int n,int** temp){
	for(int i=0;i<m;i++){
		for(int j=0;j<n;j++){
			cout << temp[i][j] << "\t";
		}
		cout<<endl;
	}
}

int main(){
	int m1,m2,n1,n2;
	int **p,**q,**answer;
	cout << "Enter the size of First Matrix:-" <<endl;
	cin >> m1 >> n1;
	cout << "Enter the size of the Second Matrix:-" <<endl;
	cin >> m2 >> n2;
	if(n1!=m2){
		cout << "Multiplication not possible";
		return 0;
	}
	else{	
		cout<< "\n Enter the elements of the 1st Matrix:-"<<endl;
		p=inputMatrix(m1,n1);
		cout<< "\n Enter the elements of the 2nd Matrix:-"<<endl;
		q=inputMatrix(m2,n2);
		answer=multiply(p,q,m1,n1,m2,n2);
		cout << "The MUltiplication of two matrix is:-"<<endl;
		displayMatrix(m1,n2,answer);
	}
	
	return 0;
}
