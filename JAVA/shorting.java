package mypackage;
import java.util.Scanner;
class shorting {
public static void main(String args[]){

//inputs
System.out.print("Enter Size of array ");
Scanner a1 = new Scanner(System.in);
int n = a1.nextInt();
int arr[] = new int[n];
System.out.println("\nEnter value: - ");
for(int a=0;a<n;a++){
System.out.print((a+1)+". ");
arr[a] = a1.nextInt();
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
System.out.println("Data shorted: -");
for(int a=0;a<n;a++){
System.out.println((a+1)+". "+arr[a]);
}


System.out.print("Enter a value witch you want to find: ");
int m = a1.nextInt();

System.out.print("Value "+m+" is found at location no : ");
for(int i=0;i<n;i++){
if(arr[i]==m){
System.out.print((i+1)+" ");
}
}
}
}
