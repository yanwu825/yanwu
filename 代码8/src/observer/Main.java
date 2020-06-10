package observer;

public class Main {
	public static void main(String[] args)
	{
		// ǰ̨С��ͯ�ӆ�
		Secretary tongzizhe = new Secretary();
		
		// ����Ʊ��ͬ��
		StockObserver tongshi1 = new StockObserver("κ���", tongzizhe);
		StockObserver tongshi2 = new StockObserver("�׹ܲ�", tongzizhe);
		
		//ǰ̨��������λͬ��
		tongzizhe.attach(tongshi1);
		tongzizhe.attach(tongshi2);
		
		//�����ϰ����
		tongzizhe.setAction("�ϰ������!");
		
		//֪ͨ����ͬ��
		tongzizhe.announce();
	}
}
