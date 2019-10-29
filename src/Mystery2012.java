public class Mystery2012 {
    public static int mystery2( int a )
    {
        int b = a + 2;
        if ( b <= 11 )
        {
            System.out.println( a + " " + b );
            a = b + mystery2( b - 1 );
        }
        else
        {
            System.out.println( "Whoa" );
            b = a - 2;
        }
        System.out.println( a + " " + b );
        return a - b;
    }
    public static void main(String[] args) {
        mystery2(8);
    }
}
