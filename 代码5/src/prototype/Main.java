package prototype;

public class Main {
	public static void main(String[] args)
	{
		Resume a = new Resume("����");
		a.setPersonalInfo("��", "29");
		a.setWorkExperience("1998-2000", "XX��˾");

		Resume b = new Resume("����");
		b.setPersonalInfo("��", "29");
		b.setWorkExperience("1998-2000", "XX��˾");

		Resume c = new Resume("����");
		c.setPersonalInfo("��", "29");
		c.setWorkExperience("1998-2000", "XX��˾");

		a.display();
		b.display();
		c.display();
	}
}
