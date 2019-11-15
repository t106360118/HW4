
public class test_P26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car26[] cars =new Car26[2];
		cars[0]=new Car26();
		cars[1]=new RacingCar26();
		
		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("第"+(i+1)+"個物件類別是"+cl);
		}
	}

}
class Car26
{
	protected int num;
	protected double gas;
	
	public Car26()
	{
		num=0;
		gas=0;
		System.out.println("生產了車子");
	}
}
class RacingCar26 extends Car26
{
	public RacingCar26()
	{
		System.out.println("生產了車子");
	}
}