public class Sir_Crescator
{
    public static void main(String[] args)
    {
        int []Numere = new int[1000];
        int n,i,k,poz=0,NrAparitii=0,j=0;
        int []Pozitii = new int[1000];
        k=SkeletonJava.readIntConsole("Dati numarul de elemente din sir ");
        n=SkeletonJava.readIntConsole("Dati numarul de cautat printre elementele sirului ");
        for (i=1;i<=k;i++)
        {
            Numere[i]=SkeletonJava.readIntConsole("Dati elementul de pe pozitia "+i+" ");
            if (Numere[i]==n)
            {
                Pozitii[i]++;
                NrAparitii++;
                j=i;
            }
        }
        System.out.println("\n");
        if (NrAparitii>=1)
        {
            System.out.print("Numarul " + n + " se gaseste pe ");
            if (NrAparitii==1)
                System.out.print("pozitia ");
            else System.out.print("pozitiile ");
            for (int z = 1; z <= j; z++)
                if (Pozitii[z]!=0)
                    System.out.print(z + " ");
        }
        else
            System.out.println("-1");

    }
}
