public class Main
{
    public static void main(String[] args) 
    {
        Stack stack = new Stack(10);
        stack.stackup(10);
        stack.stackup(20);
        stack.stackup(30);
        stack.stackup(40);
        stack.stackup(50);
        stack.stackup(60);
        stack.stackup(70);
        stack.stackup(80);
        stack.stackup(90);
        stack.stackup(100);
        System.out.println(stack.toString());
        stack.toRevers();
        System.out.println(stack.toString());
        stack.toRevers();
        System.out.println(stack.toString());
        System.out.println(stack.unpacks());
    }
}