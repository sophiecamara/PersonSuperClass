package mod3week3HW3;


	public class Student extends Person{
		int stud_id;
		double subject1,subject2;
	    int bonus=10;
		
	   public Student(int id, String name,int age, char gender,double s1,double s2)
	   {
	       super(name,age,gender);//calling parent class constructor
			  
			  this.stud_id=id;
			  this.subject1=s1;
			  this.subject2=s2;	  
		  }
		
		public void display()
		{
		
			System.out.println("Id : "+this.stud_id);
			super.display();   // calling method from Parent person class
			System.out.println(this.pname);
			System.out.println("Subject1 score : "+this.subject1);
			System.out.println("Subject2 score : "+this.subject2);
		
			System.out.println();
			System.out.println(String.format("%.3f",calculate(2)));
			System.out.println();
			System.out.println(super.calculate(2));
	     }
		
		public double calculate(int totalSubjects) {
			System.out.println("calculate() inside child class");
			double  average= ((this.subject1+this.subject2)/totalSubjects);
			return average;
		}
		public double add(double average, int bonus) {
			System.out.println("add() inside child class");
			double sum =(average+ bonus);
			return sum;
			
	}
		

}