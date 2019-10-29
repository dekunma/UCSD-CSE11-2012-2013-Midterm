 public class Test3
 {
  private int a;
  private static int b = 2;
  private int c;
  public static void main( String[] args )
  {
   Test3 ref = new Test3( 4 );
   ref.method1( ref.a );
         }
         public Test3( int c )
         {
         this.c = c;
         }
         private void method1( int x )
         {
         int c = x--;
         int b;b = a + 2;
         a = c + 3;
         System.out.println( "this.a = " + this.a );
         System.out.println( "Test3.b = " + Test3.b );
         System.out.println( "this.c = " + this.c );
         System.out.println( "c = " + c );
         System.out.println( "b = " + b );
         System.out.println( "a = " + a );System.out.println( "result = " + method2( b + c ) );
         System.out.println( "this.a = " + this.a );
         System.out.println( "Test3.b = " + Test3.b );
         System.out.println( "this.c = " + this.c );
         System.out.println( "x = " + x );
         System.out.println( "a = " + a );System.out.println( "b = " + b );
         System.out.println( "c = " + c );
         }
         public int method2( int x )
         {
         int b = x;
         int c = this.c + Test3.b;
         x = a = b + c;
         System.out.println( "this.a = " + this.a );
         System.out.println( "Test3.b = " + Test3.b );
         System.out.println( "this.c = " + this.c );
         System.out.println( "x = " + x );
         System.out.println( "a = " + a );
         System.out.println( "b = " + b );
         System.out.println( "c = " + c );
         Test3.b = b + 2;
         this.c = a + c;
         return x + 5;
         }
         }