package UNIT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY1_PracticeQues_Filter_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> data = Arrays.asList(10,10,20,20,15,30,11,17,17,16);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(data);
		list.stream().distinct().filter(n->n>15).forEach(System.out::println);
	}

}
