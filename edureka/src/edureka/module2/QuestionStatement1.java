package edureka.module2;

import java.util.Scanner;

public class QuestionStatement1 {
	public String[] id=new String[5];
	public String[] name=new String[5];
	public String[] salary=new String[5];

	public static void main(String[] args) {
		QuestionStatement1 qs1 = new QuestionStatement1();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome !");
		System.out.println("Please enter employee details: ");
		
		for (int i=0; i<5; i++) {
			System.out.println("Please enter employee id: ");
			qs1.id[i] = scanner.next();
			System.out.println("Please enter employee Name: ");
			qs1.name[i] = scanner.next();
			System.out.println("Please enter employee Salary: ");
			qs1.salary[i]=scanner.next();
		}
		
		qs1.display(qs1.id, qs1.name, qs1.salary);
		System.out.println("=========================================");
		qs1.display(qs1.id, qs1.name);
		System.out.println("=========================================");
		
		System.out.println("Please enter employee name to Search:");
		String nm = scanner.next();
		qs1.display(nm, qs1.id, qs1.name, qs1.salary);
	}
	
	public void display(String[] id, String[] name, String[] salary) {
		for(int i=0; i<5; i++) {
			if (i==0) {
				System.out.println("id\tname\tsalary");
				System.out.println("---------------------------------------");
			}
			System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
			
		}
	}

	public void display(String[] id, String[] name) {
		for(int i=0; i<5; i++) {
			if (i==0) {
				System.out.println("id\tname");
				System.out.println("----------------------------");
			}
			System.out.println(id[i]+"\t"+name[i]);
			
		}
	}
	public void display (String empName, String regno[], String name[], String salary[]) {
		for(int i=0; i<5; i++) {
			if (i==0) {
				System.out.println("id\tname\tsalary");
				System.out.println("---------------------------------------");
			}
			if(empName.equals(name[i]))
				System.out.println(id[i]+"\t"+name[i]+"\t"+salary[i]);
			
		}
	}

}
