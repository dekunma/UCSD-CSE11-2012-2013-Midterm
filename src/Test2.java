public class Test2
{
    public static void main( String[] args )
    {
        Thing1 first = new Thing1( 1 );
        Thing1 second = new Thing1( 2 );
        first.swap1( second );
        System.out.println( first.toString() );
        System.out.println( second.toString() );
        Thing1 third = new Thing1( 3 );
        Thing1 fourth = new Thing1( 4 );;
        Thing1 temp = third;
        third = fourth;
        fourth = temp;
        System.out.println( third.toString() );
        System.out.println( fourth.toString() );
        third = first;
        fourth.setCount( second.getCount() );
        System.out.println( first == third );
        System.out.println( second == fourth );
        System.out.println( first.toString().equals( third.toString() ) );
        System.out.println( second.toString().equals( fourth.toString() ) );
        System.out.println( first.toString() );
        System.out.println( second.toString() );
        System.out.println( third.toString() );
        System.out.println( fourth.toString() );
        first = new Thing1( 1 );
        second = new Thing1( 3 );
        first.swap2( second );
        System.out.println( first.toString() );
        System.out.println( second.toString() );
    }
}
