package UNIT2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY1_PracticeQues_FilterOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10,15,20,25,30,11,17,16);
		System.out.println(data);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(data);
		list.stream().filter(n->n%2==0).forEach(System.out::println);

	}

}
