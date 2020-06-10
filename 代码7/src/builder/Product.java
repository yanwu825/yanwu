package builder;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLEditorKit.Parser;

public class Product {
	List<String>	parts	= new ArrayList<String>();

	public void add(String part)
	{
		
		parts.add(part);
	}

	public void show()
	{
		System.out.println("��Ʒ ����----");
		
		for (String part : parts)
		{
			System.out.println(part);
		}
	}
}
