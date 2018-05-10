public class Duble_Triple
{
    public static void main(String[] args)
    {
        int []Numere= new int[1000];
        int n;
        n=SkeletonJava.readIntConsole("Dati numarul de elemente din sir ");
        for (int i=1;i<=n;i++)
            Numere[i]=SkeletonJava.readIntConsole("Dati elementul de pe pozitia "+i+" ");
        for (int i=1;i<=n;i++)
        {
            if (i<=n/2)
                System.out.println(Numere[i]*2+" ");
            else
            {
                if (Numere[i]%2==1)
                    System.out.println(Numere[i]*3);
                else System.out.println(Numere[i]);
            }
        }
    }
}
