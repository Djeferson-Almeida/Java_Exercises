package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = list.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		Stream<String> st2 = Stream.of("Maria","Alex","Bob");
		System.out.println(Arrays.toString(st2.toArray()));
		
		Stream<Integer> st3 = Stream.iterate(0,x -> x + 2);
		//limit para definir o quantidade de vezes que vai ser executado
		System.out.println(Arrays.toString(st3.limit(100).toArray()));
		
		//Stream de tipo Long para a geração de uma lista com números de Fibonacci
		//Número de Fibonacci -> lista de números em que a sequência é dada à soma dos números consequentes
		Stream<Long> st4 = Stream.iterate(new Long [] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]); 
		System.out.println(Arrays.toString(st4.limit(10).toArray()));
		
	}

}
