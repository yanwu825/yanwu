package prototype1;

public class Main {
	public static void main(String[] args)
	{
		Resume a = new Resume("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000", "XX��˾");

		Resume b = a;
		Resume c = a;

		a.display();
		b.display();
		c.display();
	}
}
