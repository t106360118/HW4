
public class test_P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar9 rccar1 = new RacingCar9();
		rccar1.newshow();
	}

}
class Car9
{
	protected int num;
	protected double gas;

	public Car9()
	{
		num= 0;
		gas = 0.0;
		System.out.println("���a��܇��");
	}
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}
class RacingCar9 extends  Car9
{
	private int course;
	public RacingCar9()
	{
		course=0;
		System.out.println("���a��ِ܇");
	}
	public void setCourse(int c) 
	{
		course=c;
		System.out.println("��ِ܇�O��"+course);
	}
	public void newshow() {
		System.out.println("ِ܇��܇̖��"+num);
		System.out.println("��������"+gas);
		System.out.println("ِ܇��̖��"+course);
	}
}