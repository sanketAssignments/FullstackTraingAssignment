package streamApi;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class ItemMain_11 {

	public static void main(String[] args) {
	
		List<ItemStream_11> l=new ArrayList<>();
		l.add(new ItemStream_11(101, "parle",LocalDateTime.of(2022, 4, 23, 4, 30), LocalDateTime.of(2023, 4, 23, 4, 30), 2000));
		l.add(new ItemStream_11(102, "sunfist",LocalDateTime.of(2020, 5, 20, 8, 00), LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
		l.add(new ItemStream_11(103, "monaco",LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20), 8000));
		l.add(new ItemStream_11(104, "borbon",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		l.add(new ItemStream_11(105, "derymilk",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		l.add(new ItemStream_11(106, "water botal",LocalDateTime.of(2019, 9, 12, 6, 37),null, 10000));
	
		System.out.println("Find average of the given price of item");
		
		float price=(float) l.stream().mapToDouble(ItemStream_11::getPrice).average().orElse(Double.NaN);
		System.out.println(price);
	
		System.out.println("Find the highest price of the given item");
		
		ItemStream_11 max=l.stream().map(v->v).max(Comparator.comparing(ItemStream_11::getPrice)).orElseThrow(NoSuchElementException::new);
		System.out.println(max);
		
		System.out.println("Find the lowest price of the given item");
		
		ItemStream_11 min=l.stream().map(v->v).min(Comparator.comparing(ItemStream_11::getPrice)).orElseThrow(NoSuchElementException::new);
		System.out.println(min);
	
		System.out.println("Find the item thoes have not Expiry date");
	
		List<ItemStream_11> list=l.stream().filter(v->v.getDoe()==null).collect(Collectors.toList());
		System.out.println(list);
	
		System.out.println("store the name and price from list to set");
		
		Set<ItemStream_11> value=l.stream().map(a->new ItemStream_11(a.getIname(),a.getPrice())).collect(Collectors.toSet());
		for(ItemStream_11 i:value) {
		System.out.println(i.getIname()+" "+i.getPrice());
		}
		
		System.out.println("remove duplicate price from list of item");
		
		l.stream().map(s->s.getPrice()).distinct().forEach(System.out::println);
	}
	
}
