package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();

		list.add("Maria Aparecida");
		list.add("Aghata");
		list.add("Marcos");
		list.add("Joao victor");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------");
		list.removeIf(x -> x.charAt(1) == 'a');
		System.out.println("-------------------------");
		System.out.println("Index of Aghata:" + list.indexOf("Aghata"));
		System.out.println("Index of Aghata:" + list.indexOf("Alisson"));
		
		List<String> result = list.stream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
	}

}
