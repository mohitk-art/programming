//hastable class
import java.util.Enumeration;
import java.util.Hashtable;

class hashtableExample{
public static void main(String args[]){
Hashtable ht = new Hashtable();
ht.put("Item1","Apple");
ht.put("Item2","Orange");
ht.put("Item3","Green");
ht.put("Item4","pine");
Enumeration e = ht.keys();
while(e.hasMoreElements()){
String str = (String) e.nextElement();
System.out.println(ht.get(str));
}
}
}