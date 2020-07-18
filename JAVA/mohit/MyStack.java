//linked list
import java.util.*;
public class MyStack{
	private LinkedList list = new LinkedList();
	public void push1(Object o){
		list.addFirst(o);
	}
	public void push2(Object obj){
		list.addLast(obj);
	}
	public Object bottom(){
		return list.getLast();
	}
	public Object pop(){
		return list.removeFirst();
	}
	public static void main(String[] args) {
		Car myCar;
		Bird myBird;
		MyStack s = new MyStack();
		s.push1(new Car());
		s.push2(new Bird());
		myCar = (Car)s.pop();
		System.out.println("The first element in the lisk: "+myCar);
		myBird = (Bird)s.bottom();
		System.out.println("The last element in the list: "+myBird);
	}
}

class Car{
String car1, car2, car3, car4;
	Car(){
car1="Benz";
car2="Toyota";
car3="Qualis";
car4="Santro";
	}
}

class Bird{
String bird1, bird2, bird3, bird4;
Bird(){
	bird1="parrot";
	bird1="duck";
	bird1="raven";
}
}