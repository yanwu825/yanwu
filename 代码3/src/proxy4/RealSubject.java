package proxy4;

//RealSubject�࣬����Proxy���������ʵʵ�塣
public class RealSubject implements Subject{
	
	public void request(){
		
		System.out.println("��ʵ������");
	}
}
