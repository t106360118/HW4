
public class test_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar6 rccar1 = new RacingCar6(1234,20.5,5);
	}

}
class Car6
{
	private int num;
	private double gas;

	public Car6()
	{
		num= 0;
		gas = 0.0;
		System.out.println("���a��܇��");
	}
	public Car6(int n,double g)
	{
		num= n;
		gas = g;
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
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
class RacingCar6 extends  Car6{
	private int course;
	public RacingCar6()
	{
		course=0;
		System.out.println("���a��ِ܇");
	}
	public RacingCar6(int n,double g,int c) {
		super(n,g);
		course=c;
		System.out.println("���a�˾�̖��"+course+"��ِ܇");
	}
	public void setCourse(int c) 
	{
		course=c;
		System.out.println("��ِ܇�O��"+course);
	}
}