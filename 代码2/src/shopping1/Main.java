package shopping1;

public class Main {
	private static double	total	= 0;

	public static void main(String[] args)
	{
		consume("�����շ�", 1, 1000);
		consume("��300��100", 1, 1000);
		consume("��8��", 1, 1000);

		System.out.println("�ܼ�:" + total);
	}

	public static void consume(String type, int num, double price)
	{
		CashSuper csuper = CashFactory.createCash(type);
		double totalPrices = 0;
		totalPrices = csuper.acceptCash(num * price);
		total += totalPrices;
		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}
}
