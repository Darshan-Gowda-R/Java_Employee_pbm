
public class EmpUC4{

	public static final int EMP_WAGE_PER_HOUR=20;
	public static final int EMP_DAY_HOUR=8;
	public static final int PART_TIME_HOUR=4;
	public static final int ABSENT=0;
	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int DAYS=20;
	public static void main(String[] args){

		int emp_wage=0;
		for(int i=0;i<=DAYS;i++){
			int empCheck=(int)Math.floor(Math.random()*10)%3;
			switch(empCheck){

				case PART_TIME:
					emp_wage+=(EMP_WAGE_PER_HOUR*PART_TIME_HOUR);
					break;
				case FULL_TIME:
					emp_wage+=(EMP_WAGE_PER_HOUR*EMP_DAY_HOUR);
					break;
				default :
					emp_wage+=(EMP_WAGE_PER_HOUR*ABSENT);
			}
		}
		System.out.println("Employee wage : "+emp_wage);
	}

}









