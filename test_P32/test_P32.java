
public class test_P32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vechicle32[] vc = new Vechicle32[2];
		vc[0]=new Car32(1234, 20.5);
		vc[1]=new Plane32(232);
		
		for(int i=0;i<vc.length;i++)
		{
			if(vc[i]instanceof Car32)
				System.out.println("��"+(i+1)+"�������Care");
			else 
				System.out.println("��"+(i+1)+"���������Care");
		}
	}

}
abstract class Vechicle32
{
	protected int speed;
	public void setSpeed(int s) {
		speed=s;
		System.out.println("���ٶ��O��"+speed+"��");
	}
	abstract void show();
}
class Car32 extends Vechicle32
{
	private int num;
	private double gas;

	public Car32 (int n , double g)
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
class Plane32 extends Vechicle32
{
	private int flight;
	public Plane32(int f)
	{
		flight=f;
		System.out.println("���a��"+flight+"��ε��w�C");
	}
	public void show() {
		System.out.println("�w�C�İ����"+flight);
		System.out.println("�ٶ���"+speed);
	}
}