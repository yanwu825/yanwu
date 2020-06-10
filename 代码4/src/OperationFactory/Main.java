package OperationFactory;

public class Main {
	public static void main(String[] args)
	{
		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();

		oper.setNumberA(1);
		oper.setNumberB(2);

		try
		{
			double result = oper.getResult();
			System.out.println("½á¹ûÊÇ:" + result);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
