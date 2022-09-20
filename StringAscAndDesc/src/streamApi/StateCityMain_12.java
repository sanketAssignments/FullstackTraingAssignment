package streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StateCityMain_12 {

	public static void main(String[] args) {
		
		List<CityStream_12> cs=Arrays.asList(
				new CityStream_12(1, "pune", new StateStream_12(101, "maharashtra"), 9.5f, 500000, 493),
				new CityStream_12(2, "nagpur", new StateStream_12(101, "maharashtra"), 7.7f, 400000, 393),
				new CityStream_12(3, "hydrabad", new StateStream_12(102, "telangana"), 5.8f, 350000, 450),
				new CityStream_12(4, "karimnagar", new StateStream_12(102, "telangana"), 8f, 650000, 350),
				new CityStream_12(5, "patna", new StateStream_12(103, "bihar"), 6f, 450000, 500),
				new CityStream_12(6, "gaya", new StateStream_12(103, "bihar"), 8.6f, 600000, 300)
				);
		
		System.out.println("find city with less area and highest population");
		List<CityStream_12> value=cs.stream().sorted(Comparator.comparing(CityStream_12::getPopulation).thenComparing(CityStream_12::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println("find city with high population index and high city area");
		List<CityStream_12> value1=cs.stream().sorted(Comparator.comparing(CityStream_12::getPollutionIndex).thenComparing(CityStream_12::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
		System.out.println(value1);
		
		System.out.println("print city with less population index first");
		List<CityStream_12> value2=cs.stream().sorted(Comparator.comparing(CityStream_12::getPollutionIndex)).collect(Collectors.toList());
		System.out.println(value2);
		
		System.out.println("print city with lowest population index and lowest area");
		List<CityStream_12> value3=cs.stream().sorted(Comparator.comparing(CityStream_12::getPollutionIndex).thenComparing(CityStream_12::getArea_of_city)).limit(1).collect(Collectors.toList());
		System.out.println(value3);
		
		System.out.println("count how many city in state");
		long count=cs.stream().map(CityStream_12::getCityname).count();
		System.out.println(count);
		
		System.out.println("total area of each state");
		long sum=cs.stream().collect(Collectors.summingLong(CityStream_12::getArea_of_city));
		System.out.println(sum);
		
	}

}
