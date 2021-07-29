public class Main
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(10);
        stack.stackup(2);
        stack.stackup(25);
        System.out.println(stack.toString());
        System.out.println(stack.unpacks());
        System.out.println(stack.toString());
    }
}