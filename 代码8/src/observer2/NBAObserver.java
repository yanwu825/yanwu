package observer2;

public class NBAObserver extends Observer{
	public NBAObserver(String name, Subject sub)
	{
		super(name, (Secretary) sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�ر�NBAֱ��������������");
	}
}
