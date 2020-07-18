#include<iostream>
using namespace std;
int main(){
int n;
//inputs
cout<<"Enter Size of array ";
cin>>n;
int arr[n];
cout<<"\nEnter value: - \n";
for(int a=0;a<n;a++){
cout<<a+1<<". ";
cin>>arr[a];
}


//shorting
for(int a=0;a<n;a++){
for(int b=a+1;b<n;b++){
if(arr[a]>arr[b]){ //assendig order
int temp = arr[a];
arr[a] = arr[b];
arr[b] = temp;
}
}
}

//output
cout<<endl;
for(int a=0;a<n;a++){
cout<<(a+1)<<". "<<arr[a]<<endl;
}


int m;
cout<<"Enter a value witch you want to find: ";
cin>>m;

for(int i=0;i<n;i++){
if(arr[i]==m){
cout<<"Value "<<m<<" is found at "<<(i+1)<<" Locaton";
}
}


cout<<endl<<endl;
}
