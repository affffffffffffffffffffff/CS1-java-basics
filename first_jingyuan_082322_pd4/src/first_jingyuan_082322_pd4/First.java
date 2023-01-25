package first_jingyuan_082322_pd4;
public class First
{
	public static void main(String[]args)
	{
		String result1 = String.format("Three %1$s mice","blind");
		String result2 = String.format("%1$s blind mice",3);
		String result3 = String.format("%2$s %1$s mice","blind","three");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}