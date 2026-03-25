package streamminmax;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class DAY5_StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(12,1,4,100,200,150,45,67,99);

//		Optional<Integer> result = list.stream().min((a,b)->a-b); // min return only first index value
//		Optional<Integer> result1 = list.stream().max((a,b)->b-a); // max return only last index value
//		result.ifPresent(System.out::println);
//		result1.ifPresent(System.out::println);
		
		List<Integer> list = Arrays.asList(10,20,5,40,15);
		Optional<Integer> res = list.stream().min((a,b)->a-b);
		Optional<Integer> res1 = list.stream().max((a,b)->a-b);
		res.ifPresent(System.out::println);
		res1.ifPresent(System.out::println);
		
//		List<Integer> list = Arrays.asList(10,20,10,30,20,40);
//		
//		int secondmax = list.stream().reduce(0,(a,b)->a>b?a)

	}

}
