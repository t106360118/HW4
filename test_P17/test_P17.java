
public class test_P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car17 cars[]=new Car17[2];
		cars[0]=new Car17();
		cars[0].setCar(1234, 20.5);
		
		cars[1]=new RacingCar17();
		cars[1].setCar(4567, 30.5);
		
		for(int i=0;i<cars.length;i++)
		{
			cars[i].show();
		}
	}

}
class Car17
{
	protected int num;
	protected double gas;

	public Car17()
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
class RacingCar17 extends  Car17
{
	private int course;
	public RacingCar17()
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