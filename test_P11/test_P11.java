
public class test_P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar11 rccar1 = new RacingCar11();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		rccar1.show();
	}

}
class Car11
{
	protected int num;
	protected double gas;

	public Car11()
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
class RacingCar11 extends  Car11
{
	private int course;
	public RacingCar11()
	{
		course=0;
		System.out.println("���a��ِ܇");
	}
	public void setCourse(int c) 
	{
		course=c;
		System.out.println("��ِ܇�O��"+course);
	}
	public void show() {
		System.out.println("ِ܇��܇̖��"+num);
		System.out.println("��������"+gas);
		System.out.println("ِ܇��̖��"+course);
	}
}