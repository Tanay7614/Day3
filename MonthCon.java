package Uc6;

public class MonthCon {
	public static void main(String[] args)
	{
         int parttime_hour=1;
 	  int full_time=2;
	  int wage_perhour=20;
          int emp_wage=0
          int days=0;		  
	  int total_working_days=20;
	  while (days<=total_working_days)
	{
		 int w=(int)Math.floor(Math.random()*10)%3;
                 switch (w) {
			case parttime_hour: 
				emp_hrs=4;
				break;
		
      		       case full_time:
                		emp_hrs=8;
            		        break;

    	               default:
          		        System.out.println("Inavalid choice");
 			  }
		  emp_wage=emp_wage+emp_hrs*wage_perhour;
		  days++;
	}
  		  System.out.println("Tatal wage of montnth=" + emp_wage);

	  
	}
	
	
}
