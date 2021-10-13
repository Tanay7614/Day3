package Uc3;

public class Month {
	public static void main(String[] args){
		int part_time=1;
		int full_time=2;
		int parttime_hour=4;
		int full_timehour=8;
		int wage_per_hour=20;
		int no_of_working_days=20;
		int total_emp_wage=0;
		//System.out.println(w);
                for (int Days=1; Days<=no_of_working_days;Days++) {
                double w=Math.floor(Math.random()*10)%3;
		switch ((int)w) {
		  case 1:
		       int emp_wage=parttime_hour*wage_per_hour;
		       System.out.println("Part time Employyed wage=" + emp_wage);
		       total_emp_wage= total_emp_wage+emp_wage;
		       break;
		  case 2:
		      emp_wage=full_timehour*wage_per_hour;
		      System.out.println("full time Employyed wage=" + emp_wage);
		      total_emp_wage= total_emp_wage+emp_wage;
		      break;
                  default:
		      System.out.println("Employed is Absent");
		   }
        }
        System.out.println("Total Employed Wage for 20 Days "+ total_emp_wage);
   }
}

