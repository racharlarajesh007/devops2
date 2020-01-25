
public class Employee 
{
		int eid;
		String ename;
		int age;
		double salary;
		double annualsal;
		public void getDetails()
		{
			eid=101;
			ename="rajesh";
			salary=1.01;
		}
		public void dispDetails()
		{
			System.out.println("Name"+ename);
			System.out.println("annual salary"+annualsal);
		}
		public void calculateSalary()
		{
			annualsal=salary*12;
			
		}
}
