
public class test_P41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 =new Car(1234, 20.5);
		car1.vShow();
		car1.mShow();
	}

}
interface iVechicle
{
	void vShow();
}
interface iMaterical
{
	void mShow();
}
class Car implements iVechicle,iMaterical
{
	private int num;
	private double gas;

	public Car (int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
	}
	public void vShow()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
	public void mShow()
	{
		System.out.println("܇�ӵĲ��|���F");
	}
}