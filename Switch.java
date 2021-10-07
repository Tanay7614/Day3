package Uc3;

public class Switch {
	public static void main(String[] args){
		int part_time=1;
		int full_time=2;
		int parttime_hour=8;
		int full_timehour=12;
		int wage_perhour=20;
		double w=Math.floor(Math.random()*10)%3;
		System.out.println(w);

		switch ((int)w) {
		  case 1:
		       int emp_wage=parttime_hour*wage_perhour;
		        System.out.println("Part time Employyed wage=" + emp_wage);
		        break;

		//else
		//{
		  case 2:
		    emp_wage=full_timehour*wage_perhour;
		      System.out.println("full time Employyed wage=" + emp_wage);
		      break;

		  default:
		       System.out.println("Inavalid choice");
		   }
		}
}
