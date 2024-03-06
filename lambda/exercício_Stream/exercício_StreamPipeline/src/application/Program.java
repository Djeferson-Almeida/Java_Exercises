package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main (String[]args) {
		
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x* 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		// 0-> elemento inicial, x,y-> parâmetros, x + y -> operação a ser feita
		int sum = list.stream().reduce(0, (x,y) -> x + y);
		System.out.println("Sum: " + sum);
		
		//Lista de números inteiros utilizando pipeline
		
		List<Integer> newList = list.stream()
				//filtro de números pares
				.filter(x -> x % 2 == 0)
				.map(x -> x * 10)
				//Conversão de stream para list
				.collect(Collectors.toList());
		
		
		
	}
}
