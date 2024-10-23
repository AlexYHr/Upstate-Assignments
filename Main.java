
public class Main
{
    public static void main(String[] args)
    {
        int[] a = {10, 20, 30, 40};
        int result = BinarySum(a, 0, a.length);
        System.out.println("Sum of array elements: " + result);
    }

    public static int BinarySum(int[] a, int i, int n)
    {
        if (n == 1) // Base case: return the single element at index i
        {
            return a[i];
        }
        else
        {
            int mid = n / 2; // Split the array into two halves
            return BinarySum(a, i, mid) + BinarySum(a, i + mid, n - mid);
        }
    }
}

