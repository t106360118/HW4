
public class test_P38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iVechicle38[] ivc = new iVechicle38[2];
		ivc[0]=new Car38(1234, 20.5);
		ivc[1]=new Plane38(232);
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}

}
interface iVechicle38
{
	int weight =1000;
	void show();
}
class Car38 implements iVechicle38
{
	private int num;
	private double gas;

	public Car38 (int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
class Plane38 implements iVechicle38
{
	private int flight;
	public Plane38(int f)
	{
		flight=f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	public void show() {
		System.out.println("飛機的班次是"+flight);
	}
}
