package sample;

public class Emp_wage_company {
	static int parttime_hour=4;
	static int full_timehour=8;
	

	public static void calculateWage(String company,int wage_per_hour,int no_of_working_days,int max_hrs_month) {
		int days=0;
		int total_emp_wage=0;
		int emp_hrs=0;
		int emp_wage=0;
	 while( days<no_of_working_days && emp_hrs<max_hrs_month ) {
         double w=Math.floor(Math.random()*10)%3;
		  switch ((int)w) {
		  case 1:
			   emp_wage=parttime_hour*wage_per_hour;
		       System.out.println("Part time Employyed wage=" + emp_wage);
		       total_emp_wage= total_emp_wage+emp_wage;
		       emp_hrs=emp_hrs+parttime_hour;
		       break;
		  case 2:
		      emp_wage=full_timehour*wage_per_hour;
		      System.out.println("full time Employyed wage=" + emp_wage);
		      total_emp_wage= total_emp_wage+emp_wage;
		      emp_hrs=emp_hrs+full_timehour;
		      break;
                 default:
		      System.out.println("Employed is Absent");
		   }
		days++;
       }
       System.out.println("Total employed wage for company "+company+" is "+total_emp_wage) ;  
      
	}
          public static void main(String[] args){
        	  calculateWage("Amazon", 25, 5, 25);
        	  calculateWage("demart", 25, 5, 25);
        	  
          }
}
