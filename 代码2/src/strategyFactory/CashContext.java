package strategyFactory;

public class CashContext {
	CashSuper	cashSuper;

	public CashContext(CashSuper cashSuper)
	{
		this.cashSuper = cashSuper;
	}
	
	public CashContext(String type)
	{
		if ("�����շ�".equals(type))
		{
			cashSuper = new CashNormal();
		}
		else if ("��300��100".equals(type))
		{
			cashSuper = new CashReturn(300, 100);
		}
		else if ("��8��".equals(type))
		{
			cashSuper = new CashRebate(0.8);
		}
	}

	public double acceptCash(double money)
	{
		return cashSuper.acceptCash(money);
	}
}
