package OperationFactory;

public class SubFactory implements IFactory{
	public Operation createOperation()
	{
		return new OperationSub();
	}
}
