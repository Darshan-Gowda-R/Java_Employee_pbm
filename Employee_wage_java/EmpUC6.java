 public class EmpUC6{
	public static final int IS_PART_TIME =1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR=20;
	public static final int WORK_DAYS=20;

	public static void main(String[] args){

		int empHour=0,empWage=0,day=0;


		while(empHour<=100 && day<=20){
			int empCheck=(int)Math.floor(Math.random()*10)%3;

			switch(empCheck){

				case IS_PART_TIME:
					empHour+=4;
					break;
				case IS_FULL_TIME:
					empHour+=8;
					break;
				default :
					empHour+=0;
			}
			day++;
		}
		empWage=empHour*EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " + empWage);
	}






}
