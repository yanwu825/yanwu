package shopping1;

public class CashFactory {
	public static CashSuper createCash(String type)
	{
		CashSuper cs = null;
		if ("�����շ�".equals(type))
		{
			cs = new CashNormal();
		}
		else if ("��300��100".equals(type))
		{
			cs = new CashReturn(300, 100);
		}
		else if ("��8��".equals(type))
		{
			cs = new CashRebate(0.8);
		}
		
		return cs;
	}
}
