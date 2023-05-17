class swapNumber
{
    public static void main(String args[])
    {
        void swap(int a,int b)
        {
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("A="+a);
            System.out.println("B="+b);
        }
        swapNumber obj=new swapNumber();
        obj.swap();
    }
}