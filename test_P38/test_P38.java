
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
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
	}
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}
class Plane38 implements iVechicle38
{
	private int flight;
	public Plane38(int f)
	{
		flight=f;
		System.out.println("���a��"+flight+"��ε��w�C");
	}
	public void show() {
		System.out.println("�w�C�İ����"+flight);
	}
}
