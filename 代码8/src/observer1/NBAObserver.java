package observer1;

public class NBAObserver extends Observer{
	public NBAObserver(String name, Secretary sub)
	{
		super(name, sub);
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�ر�NBAֱ��������������");
	}
}
