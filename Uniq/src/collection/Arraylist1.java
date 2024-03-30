package collection;

import java.util.ArrayList;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {
		
				ArrayList <Integer> al=new ArrayList<>();
				al.add(-4);
				al.add(-3);
				al.add(0);
				al.add(1);
				al.add(2);
				al.add(3);
				al.add(4);
				al.add(5);

				
								
				System.out.println("Array list"+ al);
				System.out.println();
				for(int i=0; i<al.size(); i++)
				{
					if(al.get(i)>0 && al.get(i)%2!=0)
					{
						System.out.println(al.get(i)+" is positive odd number");
					}
					if(al.get(i)>0 && al.get(i)%2==0)
					{
						System.out.println(al.get(i)+" is positive even number");
					}
					if(al.get(i)<0 && al.get(i)%2==0 )
					{
						System.out.println(al.get(i)+" is negetive even number");
					}
					if(al.get(i)<0 && al.get(i)%2!=0 )
					{
						System.out.println(al.get(i)+" is negetive odd number");
					}
					if(al.get(i)==0)
					{
						System.out.println(al.get(i)+" is zero");
					}
				}
			}
		
   
   


	
    


   }



