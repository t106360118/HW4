
public class test_P25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car25 car1 = new Car25();
		Car25 car2 = new Car25();
		
		Car25 car3=car1;
		System.out.println("car1�ccar2��ͬ"+car1.equals(car2));
		System.out.println("car1�ccar3��ͬ"+car1.equals(car3));
	}

}
class Car25
{
	protected int num;
	protected double gas;
	
	public Car25()
	{
		num=0;
		gas=0;
		System.out.println("���a��܇��");
	}
}