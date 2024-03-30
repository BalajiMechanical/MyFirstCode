package task1;

import java.util.HashMap;
import java.util.Map;

public class Charcount {

	public static void main(String[] args) {
  String a="aabcdeeffghkkk";
   char[] charr = a.toCharArray();
  Map<Character, Integer> hm=new HashMap<>();
  int count=0; 
  for(int i=0;i<charr.length;i++) {
	  count=0;
	  for(int j=0;j<charr.length;j++) {
		  if(charr[i]==charr[j]) {
			  count++;
		  }
	  }
	  hm.put(charr[i], count);
  }
  System.out.println(hm);
	}

}
