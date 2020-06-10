package observer2;

public class Main {
	public static void main(String[] args)
	{
		// �ϰ������
		Boss huhansan = new Boss();

		// ����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("κ���", huhansan);

		// ��NBA��ͬ��
		NBAObserver tongshi2 = new NBAObserver("�׹ܲ�", huhansan);

		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);

		huhansan.detach(tongshi1);

		// �ϰ������
		huhansan.setAction("�Һ����������ˣ�");

		huhansan.announce();
	}
}
