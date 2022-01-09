class variable
{
    static int a=30;//Static variable
    int b=20;//Instance variable
    public static void main(String[] args)
    {
        int c=10;//Local variable
        variable ref=new variable();
        System.out.println(variable.a);
        System.out.println(ref.b);
        System.out.println(c);    
    }
}
class A
{
    static int a=10;//static variable
    int b=20;//instance variable
    public static void main(String[] args)
    {
        int c=30;//local variable
        A ref=new A();
        System.out.println(A.a);
        System.out.println(ref.b);   
        System.out.println(c);
    }
}