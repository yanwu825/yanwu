package observer;
/*
 * ����Ʊͬ����
 */
public class StockObserver {
	private String		name;
	private Secretary	sub;

	public StockObserver(String name, Secretary sub)
	{
		this.name = name;
		this.sub = sub;
	}

	public void update()
	{
		System.out.println(sub.getAction() + "	" + name + "�رչ�Ʊ���飬����������");
	}
}
