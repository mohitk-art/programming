//stack class
import java.util.*;
public class stackEx{
public static void main(String args[]){
	Stack st = new Stack();
	st.push("Java");
	st.push("letest");
	st.push("edition");
	st.push("-fifth");
	System.out.println("The Element in the stack : "+st);
	System.out.println("The Element at the top : "+st.peek());
	System.out.println("The Element poped out of the stack : "+st.pop());
	System.out.println("The Element in a stack after pop out an element : "+st);
	System.out.println("The result of Searching : "+st.search("r u")); 
}
}