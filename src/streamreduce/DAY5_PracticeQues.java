package streamreduce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DAY5_PracticeQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(12,5,33,9,21,1);
//		List<Integer> sortedList = list.stream().sorted().toList();
//		System.out.println(sortedList);
		
//		List<Integer> list = Arrays.asList(45,11,78,2,90,34);
//		List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();
//		System.out.println(sortedList);
//		
		// ascending and descending using logic and function
//		List<Integer> list = Arrays.asList(18,42,7,91,33,25,60);
//		List<Integer> sortedList = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
//		List<Integer> sortedList1 = list.stream().sorted().skip(list.size()-3).toList();
//		System.out.println(sortedList);
//		System.out.println(sortedList1);
		
		// even number
//		List<Integer> list = Arrays.asList(12,5,33,9,21,1);
//		List<Integer> sortedList = list.stream().filter(n->n%2==0).toList();
//		System.out.println(sortedList); 
		
		// second highest
//		List<Integer> list = Arrays.asList(12,55,88,34,99,21);
//		Integer secondHighest = list.stream().sorted(Comparator.reverseOrder()).toList().get(1);
//		System.out.println(secondHighest);
		
		//
//		List<Integer> list = Arrays.asList(8,26,13,41,19,32,5);
//		Integer secondHighest = list.stream().sorted().filter().toList().get(1);
//		System.out.println(secondHighest); // not completed
		
//		List<String> list = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
//		List<String> Ascending = list.stream().sorted().toList();
//		System.out.println(Ascending);
		//11. compare using logic 
//		List<String> list1 = Arrays.asList("Ravi","Ankit","Zoya","Meena","Kunal");
//		List<String> Descending = list1.stream().sorted((a,b)->b.compareTo(a)).toList();
//		System.out.println(Descending);
		
		List<String> list = Arrays.asList("Java","SpringBoot","API","Microservices","SQL");
		List<String> Ascending = list.stream().sorted((a,b)->b.length()-a.length()).toList();
		System.out.println(Ascending);

	}

}
