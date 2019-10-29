public class Mystery2013 {
    public static int mystery( int a )
    {
        int b = a + 3;
        if ( b <= 11 )
        {
            System.out.println( a + " " + b );
            a = b - mystery( b - 1 );
        }
        else
        {
            System.out.println( "Stop" );
            b = a - 2;
        }
        System.out.println( a + " " + b );
        return a + b;
    }

    public static void main(String[] args) {
        mystery(5);
    }

}
