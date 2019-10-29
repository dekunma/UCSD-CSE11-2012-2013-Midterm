class Thing1
{
    private int count;

    public Thing1( int count )
    {
        this.count = count;
    }
    public int getCount()
    {
        return this.count;
    }
    public void setCount( int count )
    {
        this.count = count;
    }
    public String toString()
    {
        String s = " ";
        switch( this.count )
        {
            case 1:
                s = s + "1st ";
                break;
            case 2:
                s = s + "2nd ";
                break;
            case 3:
                s = s + "3rd ";
            default:
                s = s + "rest ";
                break;
        }
        return s;
    }
    public void swap1( Thing1 t1 )
    {
        Thing1 temp;
        Thing1 t2 = this;
        temp = t1;
        t1 = t2;
        t2 = temp;
    }
    public void swap2( Thing1 t1 )
    {
        int temp;
        temp = this.getCount();
        this.setCount( t1.getCount() );
        t1.setCount( temp );
    }
} 