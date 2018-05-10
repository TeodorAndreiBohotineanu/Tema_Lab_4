public class Numere_Perechi
{
    public static void main(String[] args)
    {
        int x,y,n,i,k=0;
        int []Numere= new int[1000];
        int []NumereMari= new int [1000];
        n=SkeletonJava.readIntConsole("Dati numarul de elemente din sir ");
        Numere[1]=SkeletonJava.readIntConsole("Dati primul numar din sir ");
        Numere[2]=SkeletonJava.readIntConsole("Dati al doilea numar din sir ");
        x=Numere[1];
        y=Numere[2];
        System.out.println(x);
        System.out.println(y);
       for (i=3;i<=n;i++)
        {
            if (x>y)
            {
                NumereMari[++k] = x;
                NumereMari[++k] = y;
            }
            x=y;
            Numere[i]=SkeletonJava.readIntConsole("Dati elementul de pe pozitia "+i+" ");
            y=Numere[i];
        }
        System.out.println("Perechile de numere respectand proprietatea exercitiului sunt : ");
        for (int j=1;j<=n;i++)
        {
            System.out.print(NumereMari[j]+" ");
        }
    }
}