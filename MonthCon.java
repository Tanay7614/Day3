package Uc3;

public class MonthCon {
	public static void main(String[] args)
	{
	  int perhour_emp_wage=20;
	  int working_hour=5;
	  int p=working_hour;
	  int total_days=20;
	  while (p<=working_hour*total_days)
	{

	    int wage = p*perhour_emp_wage;
	    p++;
	}
	  System.out.println("Tatal wage of montnth=" +wage);
	}
}
