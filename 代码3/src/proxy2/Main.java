package proxy2;

public class Main {
	public static void main(String[] args)
	{
		Girl jiaojiao = new Girl();
		jiaojiao.setName("���");

		Proxy daili = new Proxy(jiaojiao);

		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
