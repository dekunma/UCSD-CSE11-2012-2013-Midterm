public class Trace
{
    public static void main( String[] args )
    {
        System.out.println( "main1" );
        foo3();
        System.out.println( "main2" );
        foo2();
        System.out.println( "main3" );
        foo1();
    }
    public static void foo1()
    {
        System.out.println( "A" );
    }
    public static void foo2()
    {
        System.out.println( "B" );
        foo1();
        System.out.println( "C" );
    }
    public static void foo3()
    {
        System.out.println( "D" );
        foo2();
        System.out.println( "E" );
    }
}
