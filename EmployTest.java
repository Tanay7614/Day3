package Sample;

public class EmployTest {
	int part_time=1;
	int full_time=2;
	static int parttime_hour=4;
	static int full_timehour=8;
	static int wage_per_hour=20;
	static int no_of_working_days=20;
	static int max_hrs_month=100;
	public static void calculateWage() {
		int days=0;
		int total_emp_wage=0;
		int emp_hrs=0;
		int emp_wage=0;
		
		//System.out.println(w);
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
        System.out.println("Total Employed Wage for 20 Days "+ total_emp_wage);
	}
	
	public static void main(String[] args){
		calculateWage();
}
	}