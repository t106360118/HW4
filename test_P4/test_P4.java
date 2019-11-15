
public class test_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar4 rccar1=new RacingCar4();
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
	}

}
class Car4
{
	private int num;
	private double gas;

	public Car4()
	{
		num= 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class RacingCar4 extends  Car4{
	private int course;
	public RacingCar4()
	{
		course=0;
		System.out.println("生產了賽車");
	}
	public void setCourse(int c) 
	{
		course=c;
		System.out.println("將賽車設為"+course);
	}
}