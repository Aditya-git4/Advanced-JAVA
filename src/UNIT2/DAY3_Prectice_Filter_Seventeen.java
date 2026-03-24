package UNIT2;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int eid;
	String name;
	String dept;
	public Employee(int eid, String name, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
	}
	
}

public class DAY3_Prectice_Filter_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1,"Ankit","MCA"));
		list.add(new Employee(2,"Aditya","CSE"));
		
		List<String> empName = list.stream().map(emp->emp.name).toList();
		System.out.println(empName);
		

	}

}
