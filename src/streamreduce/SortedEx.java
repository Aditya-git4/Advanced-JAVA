package streamreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(23,12,1,45,23,76,26,91);
		System.out.println(list);
		List<Integer> sortedList = list.stream().sorted((a,b)->b-a).toList();
		List<Integer> sortedList1 = list.stream().sorted((a,b)->a-b).toList(); // rembember user for descending
		List<Integer> sortedList2 = list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sortedList);
		System.out.println(sortedList1);
		System.out.println(sortedList2);
	}

}
