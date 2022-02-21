package mod3week3HW3;

public class Starter1 {

	
		public static void main(String[] args) {
			Employee emp1 = new Employee(3,"John",34,'M',200000.00);
			Employee emp2 = new Employee(25,"Faty",27,'F',350000.00);
			Student st1 = new Student (100,"Ray",45,'M',95.00,88.00);
			Student st2 = new Student(105,"Mary",39,'F',99.00,92.00);
			
		System.out.println();
		
		
			emp1.display();
			emp2.display();
			st1.display();
			st2.display();
	
		}	
}

