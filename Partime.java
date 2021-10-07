package Uc3;

public class Partime {
	public static void main(String[] args){
		int part_time=0;
		int full_time=1;
		int parttime_hour=8;
		int full_timehour=12;
		int wage_perhour=20;
		double w=Math.floor(Math.random()*10)%2;
		if( part_time==w){
		     int emp_wage=parttime_hour*wage_perhour;
		   System.out.println("Part time Employyed wage=" +emp_wage);
		}
		else
		{
		    int emp_wage= full_timehour*wage_perhour;
		    System.out.println("full time Employyed wage=" +emp_wage);

		}
		}

}
