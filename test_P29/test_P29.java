
public class test_P29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle29[] vc = new Vechicle29[2];
		vc[0]=new Car29(1234, 20.5);
		vc[0].setSpeed(60);
		
		vc[1]=new Plane29(232);
		vc[1].setSpeed(500);
		
		for(int i=0;i<vc.length;i++)
		{
			vc[i].show();
		}
	}

}
abstract class Vechicle29
{
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("將速度設為"+speed+"了");
	}
	abstract void show();
}
class Car29 extends Vechicle29
{
	private int num;
	private double gas;

	public Car29 (int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("速度是"+speed);
	}
}
class Plane29 extends Vechicle29
{
	private int flight;
	public Plane29(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
		System.out.println("速度是"+speed);
	}
}