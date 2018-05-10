public class Ma_Pana_La_Introd_0
{
    public static void main(String[] args)
    {
        int n,i=0,S=0,k;
        double Ma;
        k=SkeletonJava.readIntConsole( "Dati primul numar ");
        while (k!=0)
        {
            S=S+k;
            i++;
            Ma=(double)S/i;
            System.out.println("Media aritmetica a numerelor introduse pana acum este : "+Ma);
            k=SkeletonJava.readIntConsole( "Dati urmatorul numar ");
        }
    }
}
