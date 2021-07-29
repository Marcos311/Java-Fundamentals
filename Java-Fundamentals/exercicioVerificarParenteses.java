public class Main
{
	public static void main(String[] args)
	{
		Row row = new Row(10);
		
		row.toAdd("(");
		row.toAdd("(");
		row.toAdd("X");
		row.toAdd("+");
		row.toAdd("Y");
		row.toAdd(")");
		row.toAdd(")");
		System.out.println(row.toString());
		System.out.println(row.CheckParentheses());
	}
}
