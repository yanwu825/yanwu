package LeiFeng;

public class Main1 {
	public static void main(String[] args)
	{
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();

		student.buyRice();
		student.sweep();
		student.wash();
	}
}
