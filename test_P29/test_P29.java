
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
		System.out.println("���ٶ��O��"+speed+"��");
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
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
	}
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
		System.out.println("�ٶ���"+speed);
	}
}
class Plane29 extends Vechicle29
{
	private int flight;
	public Plane29(int f)
	{
		flight=f;
		System.out.println("���a��"+flight+"��ε��w�C");
	}
	public void show() {
		System.out.println("�w�C�İ����"+flight);
		System.out.println("�ٶ���"+speed);
	}
}