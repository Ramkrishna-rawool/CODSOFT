package interns_Task;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyClass {

	public static void main(String[] args) 
	{
		
		    
		Set<String> list = new HashSet<>();
		list.add("Apple");
		list.add("apple");
		list.add("banana");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
		String item = iterator.next();
		iterator.remove();
		System.out.print(list);
		}

		
		
		
		
		
		    }
		}

	


