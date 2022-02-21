package mod3week3HW3;

public class Employee extends Person{
	  int empId;
	  double empSalary;
	  
	  
	  Employee()
	  {
		  
	  }
	  
	  
	  Employee(int id, String name,int age, char gender,double salary)
	  {
		 
		 super(name,age,gender);
		 empId=id;
		 empSalary=salary;
	  }
	  


	public void display()
	{
		//System.out.println(School);
		System.out.println("-------------");
		System.out.println("Id : "+this.empId);
		super.display();
		System.out.println("Salary : "+this.empSalary);
		System.out.println();
		
	}



	public double calculate(int bonus) {
		double  netsalary= bonus+ this.empSalary;
		return netsalary;
}
}