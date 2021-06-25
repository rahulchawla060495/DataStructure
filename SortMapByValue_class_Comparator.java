//sort map by value using class level comparator
import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	   HashMap<String,Integer> hmap=new LinkedHashMap<String,Integer>();
	   hmap.put("Math",75);
	   hmap.put("SocialScience",97);
	   hmap.put("Science",75);
	   hmap.put("English",90);
	   List<Map.Entry<String,Integer>> lst=new LinkedList<Map.Entry<String,Integer>>(hmap.entrySet());
	System.out.println(lst);
	Collections.sort(lst,new HashMapByValue());
	   	System.out.println(lst);
	   	hmap.clear();
	   for(Map.Entry<String,Integer> ai : lst)
	   {
	       hmap.put(ai.getKey(),ai.getValue());
	   }
	   System.out.println(hmap);
	}
}
class HashMapByValue implements Comparator<Map.Entry<String,Integer>>
{
    public int compare(Map.Entry<String,Integer> s1,Map.Entry<String,Integer> s2)
    {
     if(s1.getValue()>s2.getValue())
     {
         return 1;
     }
     else
     {
         return -1;
     }
    }
}