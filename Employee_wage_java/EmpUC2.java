public class EmpUC3{

	public static final int EMP_WAGE_PER_HOUR=20;
	public static final int EMP_DAY_HOUR=8;

	public static void main(String[] args){

		int empCheck=(int)Math.floor(Math.random()*10)%2;

		if(empCheck==1)
			System.out.println("Employee wage : "+(EMP_WAGE_PER_HOUR*EMP_DAY_HOUR));
		else
			System.out.println("Employee WAGE : 0" );
	}
}







