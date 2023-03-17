public class A{
    public void add()
    {
        int a=10;
        int b=30;
        int c=a+b;
        System.out.println(c);
    }
    public void sub()
    {
        int a =70;
        int b = 100;
        System.out.println(a+b);
    }
    public static void main(String args[])
    {
        A a=new A();
        a.add();
        a.sub();
    }
}
