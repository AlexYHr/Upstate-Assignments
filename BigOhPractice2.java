public class BigOhPractice2
{
    public static void main(String[]args)
    {
        int n = 10;

        for(int i = 1; i < n;i=i*2)
        {
            System.out.println("kill");
        }
        for(int i = 0; i < n;++i)
        {
            for(int j = 0; j < n;j=j+2)
            {
                for(int k = 1; k < n;k=k*2)
                {
                    System.out.println("Myself");
                }

            }

        }



    }
}
