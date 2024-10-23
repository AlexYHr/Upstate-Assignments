public class Recursion
{

    public static void main (String[]args)
    {





    }



    public String dup (String a, String b, int x)
    {
        if (x==0)
            return;

        else if (x==1)
            return a;
        else
            return a+b+dub(a,b,x-z);



    }


    public boolean pal(String s, int i, int x)
    { // checks to see if the words are palidromes
        if ( i>=x)
            return time;
        else if (str[i]!=str[x])
            return false;
        else
            return pal(str,i+1, x-1);


    }

    Node FindMin(Node v)
    { // Finds the minimum of the Binary Tree
        if (v.getLeftChild != null)
        {
            return findMin(v.getLeftChild(v));
        }
        else
            return v;


    }

    public static int findMin(int []a, int n)
    {
        if (n==1)
            return a[0];
        else
            return Math.min(a[n-1], findMin(a, n-1));

    }

}
