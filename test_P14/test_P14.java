
public class test_P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14 car1 =new RacingCar14();
		car1.setCar(1234, 20.5);
		car1.show();
	}

}
class Car14
{
	protected int num;
	protected double gas;

	public Car14()
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
class RacingCar14 extends  Car14
{
	private int course;
	public RacingCar14()
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