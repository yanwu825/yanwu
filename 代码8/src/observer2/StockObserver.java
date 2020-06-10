package observer2;

public class StockObserver extends Observer{
	public StockObserver(String name, Subject sub)
	{
		super(name, (Secretary) sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
