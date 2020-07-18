package my_package;
import java.util.*;
public class exceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=5;
int c=5;
int x,y;

try {
	x = a/(b-c);
}
catch(ArithmeticException e) {
	System.out.println("Division By Zero");
}
y=a/(b+c);
System.out.println(+y);
	}
}
