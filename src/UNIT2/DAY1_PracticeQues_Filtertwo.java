package UNIT2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DAY1_PracticeQues_Filtertwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> data = Arrays.asList("Amit","Ravi","Anil","Vikas","Ashok","Rahul");
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(data);
		data.stream().filter(n->n.startsWith("A")).forEach(System.out::println);
		

	}

}
