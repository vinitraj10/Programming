#include<iostream>
using namespace std;

class _vector {


	int* vec;
        int len;
  public:
  _vector(){
    vec = new int[100];
        
     len = 0;
    
    }
    
   _vector(int no){
        vec = new int[100];
        vec[0] = no;
        len++;
   
   } 
    void add_front(int no){
         if (len == 0){
           vec[len] = no;
           ++len;
         }
         
         else {
            for(int i=len;i>0;i--){
                vec[i] = vec [i-1];
            }
            
            vec[0] = no;
            ++len; 
          }  
     } 
     
     
     void add_rear(int no){
     
         if (len < 100)
             vec[len] = no;
             ++len;
     }
     
    void display(){
      for (int i=0;i<len;i++)
      	cout <<vec[i]<<"\t";
    }
    
    void capacity(){
     cout<<"\n Capacity of vector: " <<len <<endl;
    }
    
 };
 
 
 int main() {
     _vector v1 ;
     v1.add_front(4);
     v1.add_front(6);
     v1.add_front(9);
     v1.add_rear(12);
     v1.add_rear(10);
     v1.display();
     v1.capacity();
 }
