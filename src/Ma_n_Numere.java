public class Ma_n_Numere
{
    public static void main(String[] args)
    {
        int n,i,S=0,k;
        double Ma;
        n=SkeletonJava.readIntConsole("Dati numarul de numere : ");
        for (i=1;i<=n;i++)
        {
            k = SkeletonJava.readIntConsole("Dati numarul " + i+" ");
            S = S + k;
        }
        Ma = (double) S/n;
        System.out.println("Media artimetica a "+n+" numere este : "+Ma);
    }
}
