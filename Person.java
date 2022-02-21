package mod3week3HW3;

public class Person {
	   static int  count=0;
		
	   String pname;
	   int page;
	   char pgender;
	   double salary;
	   int Id;
	   int bonus;

	     
	    public Person()
	    {
	    	
	    }
	    
	    
	    //parameterized constructor
	    public Person(String name, int age, char gender)
	    {
	    	pname=name;
	    	page=age;
	    	pgender=gender;
	    	count++;
	    }   
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	Person p1= new Person();
	Person p2= new Person();

	p1.pname="Sophie";
	p1.page=36;
	p1.pgender= 'F';

	p2.pname="Idy";
	p2.page=38;
	p2.pgender= 'M';

	p1.display();	
	p2.display();	
	    
	    }  
	    public void display()
	    {
	    	System.out.println("Name : "+this.pname);
	    	System.out.println("Gender : "+this.pgender);
	    	System.out.println("Age : "+this.page);
	    }
	    double calculate(int num)
	    {
	    	System.out.println("calculate () inside This parent class Person");
	    	
			return 10.00;
	    }
	    public  static  void totalPerson()
	    {
	    	  	System.out.println("total person objects are:"+ count);
	    }

}