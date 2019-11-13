package fr.maif.formation.fichesocietaire;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class StreamExample {

	public static void main(String[] args) {
		IntStream flow = IntStream.iterate(0, n -> n + 1);
		
		OptionalDouble average = flow.limit(10000000)
									.parallel()
									.filter(e -> e % 3 == 0)
									.average();
		
		if (average.isPresent() ) {
			System.out.println(average.getAsDouble());
		}

		
		IntStream flow2 = IntStream.iterate(0, n -> n + 1);
		flow2.limit(1000)
			.filter(e -> Math.sqrt(e) % 3 == 0)
			.forEach(System.out::println);
		
	}

}
