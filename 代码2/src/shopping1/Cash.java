package shopping1;

public class Cash {
	private double	total	= 0;

	public void submit(int num, double price)
	{
		double totalPrices = num * price;
		total += totalPrices;

		System.out.println("����:" + price + " ����:" + num + "�ϼ�:" + totalPrices);
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}
}
