package UNIT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY1_PracticeQues_FilterFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("java","python","c","react","c#","nextjs","nodejs");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(data);
		list.stream().filter(lang->lang.length()>4).forEach(System.out::println);
		
		

	}

}
