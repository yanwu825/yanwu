package Factory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program2 {
	public static void main(String[] args)
	{
		InputStreamReader stdin = null;
		BufferedReader bufferReader = null;

		stdin = new InputStreamReader(System.in);
		bufferReader = new BufferedReader(stdin);

		try
		{
			System.out.print("����������A:");
			String numberA = bufferReader.readLine();
			System.out.print("��ѡ�������(+��-��*��/):");
			String operator = bufferReader.readLine();
			System.out.print("����������B:");
			String numberB = bufferReader.readLine();

			String result = "";

			if ("+".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						+ Integer.parseInt(numberB));
			}
			else if ("-".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						- Integer.parseInt(numberB));
			}
			else if ("*".equals(operator))
			{
				result = String.valueOf(Integer.parseInt(numberA)
						* Integer.parseInt(numberB));
			}
			else if ("/".equals(operator))
			{
				if (!"0".equals(numberB))
					result = String.valueOf(Integer.parseInt(numberA)
							/ Integer.parseInt(numberB));
				else
					result = "��������Ϊ0";
			}

			System.out.println("�����:" + result);
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (NumberFormatException ex)
		{
			System.out.println("����������:" + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
