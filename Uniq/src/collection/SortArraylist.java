package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist {

	public static void main(String[] args) {
   List a=new ArrayList<>();
   a.add("Muthu");
   a.add("Balaji");
   a.add("Bharath");
   a.add("Ram");
   a.add("Thulasi");
   System.out.println("Before Sorting :"+" "+ a);
   Collections.sort(a);
   System.out.println("After Sorting :"+" "+ a);
	}

}
