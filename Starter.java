package mod3week3HW3;


public class Starter {

   
	public static void main(String[] args) 
    {
			 // Creating POJOs or Beans
		    Person1 p1= new Person1();
			Person1 p2 = new Person1();
		
			
			//Assigning or setting the properties
	        p1.setPname("Janet");
			p1.setPage(33);
			p1.setPgender('F');
		
			  		
			p2.setPname("John");
			p2.setPage(30);
			p2.setPgender('M');
				
			
	        //Displaying or getting the properties
			System.out.println(p1.getPname());
			System.out.println(p1.getPage());
			System.out.println(p1.getPgender());
			System.out.println();
			
			
	      	System.out.println(p2.getPname());
			System.out.println(p2.getPage());
			System.out.println(p2.getPgender());

			
		    Person1.totalPerson();
	     
		}
	      
		}