package UNIT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY1_PracticeQues_FilterFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("java",null,"spring",null,"react");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(data);
		System.out.println(data);
		List<String> notNullList=list.stream().filter(str->str != null).toList();
		System.out.println(notNullList);
		
		

	}

}
