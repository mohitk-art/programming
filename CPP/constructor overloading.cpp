#include<iostream.h>
#include<conio.h>
class distence{
	int feet;
	float inches;
	public:
	distence(){
		fect = 0;
		inches = 0.0;
	}
	distence(int ft, float in){
		feet=ft;
		inches=in;
	}
	void readdata(){
		cout<<"Enter feet & inches";
		cin>>feet>>inches;
	}
	void showdata(){
		cout<<"feet"<<feet;
		cout<<"Inches"<<inches;
	}
};

int main(){
	distence d1, d2(3,4.5), d3;
	d1.showdata();  //0, 0.0
	d2.showdata();  //3, 4.5
	d3.readdata();  //read
	d3.showdata();  //write
}