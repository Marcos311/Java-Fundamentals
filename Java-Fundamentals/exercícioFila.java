public class Main
{
	public static void main(String[] args)
	{
		Row row = new Row(10);
		
		row.toAdd(20);
		row.toAdd(58);
		System.out.println(row.toString());
		row.toRemove();
		System.out.println(row.toString());
	}
}
