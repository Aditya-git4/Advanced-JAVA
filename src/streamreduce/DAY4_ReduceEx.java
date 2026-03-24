package streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class DAY4_ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> list = Arrays.asList(34,12,45,76,34,56,54,32);
//		int sum = list.stream().reduce(0, (a,b)->a+b)/list.size();
//		System.out.println("sum="+sum);
//		double avg = sum/list.size();
//		System.out.println("Avg ="+avg);
		
//		List<Integer> list = Arrays.asList(10,20,30,40,50);
//		int sum = list.stream().reduce(0, (a,b)->a+b);
//		System.out.println("Sum = " + sum);
		
//		List<Integer> list = Arrays.asList(12,45,7,89,23,56);
//		Optional<Integer> max = list.stream().reduce((a,b)->Integer.max(a,b));
//		System.out.println("MAX = " + max);
//		
//		List<Integer> list = Arrays.asList(10,20,30,40,50,60,70);
//		int count = list.stream().reduce(0,(a,b)->a+1 );
//		double count = list.stream().count(); // can be used like this 
//		System.out.println("Count = " + count);
		
//		List<String> list = Arrays.asList("Java","Stream","API","Reduce");
//		String sum = list.stream().reduce("", (a,b)->a+" "+b);
//		System.out.println(sum);
		
		
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//		int sum = list.stream().reduce(0, (a,b)->a*a);
//		System.out.println("Square = " + sum); // not completed do it at home
		
//		List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
//		int max = list.stream().reduce(0,(a,b)->a>b?a:b);
//		int secondmax = list.stream().reduce(0,(a,b)->a>b&&a<max?a:b);
//		System.out.println("Second Highest = " + secondmax);
		
//		List<Integer> list = Arrays.asList(12,45,67,23,89,34,78);
//		int max = list.stream().reduce(100,(a,b)->a<b?a:b);
//		int secondmin = list.stream().reduce(0,(a,b)->a<b&&a>max?a:b);
//		System.out.println("Second Minimum = " + secondmin);
		
		// find longest string
//		List<String> list = Arrays.asList("Java","Programing","Stream","API","Functional");
//		String large = list.stream().reduce();
//		System.out.println(large);
//		not completed
		
		// important
		int value = 123456;
		int rel = String.valueOf(value).chars().map(c->c-'0').reduce(0, (a,b)->a+b);
		System.out.println(rel);
		// factorial Most Important exam      
		int n = 5;
		int fact =IntStream.rangeClosed(1, n).reduce(1, (a,b)->a*b);
		System.out.println(fact);
		
		
		
		
		
		
		

	}

}
