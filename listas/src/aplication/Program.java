package aplication;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();


		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");		
		
		System.out.println(list.size());
		
		list.remove(3);
		
		for (String x : list) {        // exemplo for each
			System.out.println(x);
			
		}

	}

}
