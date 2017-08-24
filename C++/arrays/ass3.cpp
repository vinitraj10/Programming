#include <iostream>
using namespace std;

class Matrix{
	int m,n;
	int **p;
	
	public:
		Matrix(int m,int n){
			this.m = m;
			this.n = n;
			p=createMatrix(m,n);
		
		}	
		
		int ** createMatrix(int m,int n){
			int **temp = new int *[m];
				for(int i=0;i<m;i++){
				    int *x = new int[n];
				    temp[i]=x;
				}
			return temp;
		}
       void inputMatrix(){
			for(int i=0;i<this.m;i++){
				for(int j=0;j<this.n;j++)
					cin>>this.p[i][j];  
			}
		
		}
		
		void add(Matrix M3,Matrix M1,Matrix M2){
			for(int i =0;i<M1.m;i++){
				for(int j=0;i<M1.n;j++){
					M3.p[i][j] = M1.p[i][j] + M2.p[i][j];
				
				}
			}
		
		}

		void display(){
		
			for(int i=0;i<this.m;i++){
				for(int j=0;j<this.n;j++){
					cout << this.p[i][j] << '\t';
				}
				cout << endl;
			}
		
		
		}
       


};






/*
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
*/
int main(){
	cout << "Matrix Operations choose any options from the following\n"<<endl;
	cout << "1.)Add\n2.)Multiply\n3.)Transpose"<<endl;
	int opt;
	cin >> opt;
	switch(opt){
		case 1:
			int m1,n1,m2,n2;
			cout << "Enter the size of Matrix-1" << endl;
			cin >> m1 >> n1;
			Matrix M1(m1,n1);
			M1.inputMatrix(m1,n1);
			cout << "Enter the size of Matrix-2" << endl;
			cin >> m2 >> n2;
			Matrix M2(m2,n2);
			M2.inputMatrix(m2,n2);
			Matrix M3(m1,n1);
			M3.add(M3,M1,M2);
			M3.display();
			break; 
		case 2: 
			cout << "Multiply";
			break;
		case 3:
			cout << "Transpose";
			break;
		default:
			cout << "Wrong Option";
			break;
	}
	
	return 0;
}



/*

int m1,m2,n1,n2;
	int **p,**q,**answer;
	cout << "Enter the size of First Matrix:-" <<endl;
	cin >> m1 >> n1;
	Matrix M1(m1,n1);
	cout << "Enter the size of the Second Matrix:-" <<endl;
	cin >> m2 >> n2;
	Matrix M2(m2,n2);
	
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
	



*/
