public class Swap
{
    private int a;
    public Swap( int a )
    {
        this.a = a;
    }
    public void swap( int a, int b )
    {
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
    }
    public void swap( Swap ref )
    {
        int tmp;
        tmp = this.a;
        this.a = ref.a;
        ref.a = tmp;
    }
    public static void swap( Swap ref1, Swap ref2 )
    {
        Swap tmp;
        tmp = ref1;
        ref1 = ref2;
        ref2 = tmp;
    }
    public static void main( String[] args )
    {
        int a = 44; Swap ref1;
        int b = 11; Swap ref2;
        ref1 = new Swap(3);
        ref2 = new Swap(7);
        Swap.swap( ref1, ref2 );
        System.out.println( ref1.a );
        System.out.println( ref2.a );
        ref1 = new Swap(3);
        ref2 = new Swap(7);
        ref1.swap( a, b );
        System.out.println( a );
        System.out.println( b );
        ref1 = new Swap(3);
        ref2 = new Swap(7);
        ref1.swap( ref2 );
        System.out.println( ref1.a );
        System.out.println( ref2.a );
    }
}
