
public class Patternjava {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Patternjava first = new Patternjava(); //object create 
           
            first.pattern1();
            first.pattern2();
            first.pattern3();
            first.pattern4();
            first.pattern5();
            first.pattern6();
            first.pattern7();
  
               
}

	

	private void pattern7() {
		// TODO Auto-generated method stub
		  //MOHAMED SULTHAN PRINTING
		 //priting "L"
		   for(int star=1; star<=8; star++)
		   {  
			   System.out.println(" * ");
		   }
			System.out.println();
	
		for(int star=1; star<=8; star++)
		{
			System.out.print(" * ");
 		}
		    System.out.println();	
	}
	

	private void pattern6() {
		// TODO Auto-generated method stub
		 // I " * "  printing
		for(int star=1; star<=7; star++)
		{
			System.out.print(" * ");
		}
		System.out.println();
		 for(int star=1; star<=4; star++)
		 {
			 System.out.print(" * ");
		 }
	      System.out.println();
	      for (int star=1; star<=7; star++)
			{
				System.out.print(" * ");
			}
			 System.out.println();
		
	}

	private void pattern5() {
		// TODO Auto-generated method stub
		 // C " * " print 
		for(int star=1; star<=7; star++)
		{
			System.out.print(" * ");
		}
		System.out.println();
		for (int star=1; star<=9; star++)
		{
			System.out.println(" *  ");
		}
		
		for (int star=1; star<=7; star++)
		{
			System.out.print(" * ");
		}
		 System.out.println();
	}

	private void pattern4() {
		// TODO Auto-generated method stub
		for (int row=1; row<=5; row++)
		{
			
			for(int num= 5; num>=5-row; num--)
			{
			System.out.print(num + "  ");
			}
			
		 }
			System.out.println();
	}

	private void pattern3() {
		// TODO Auto-generated method stub
		  //** pattern program
		for(int row= 1;row <=5;row++)
		{
		for(int num= 1;num<=6-row;num++)
		{
		System.out.print("*"+ "    ");
		}

		System.out.println();
		} 
		
	}
		
	
