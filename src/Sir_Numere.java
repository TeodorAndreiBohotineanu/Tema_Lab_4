public class Sir_Numere
{
    public static void main(String[] args)
    {
        int max=0,min=9,S=0,i,n,k=0;
        int []Numere = new int[1000];
        int [] NumereDublate = new int[1000];
        n=SkeletonJava.readIntConsole("Dati numarul de numere din sirul de numere ");
        for (i=1;i<=n;i++)
        {
            Numere[i]=SkeletonJava.readIntConsole("Dati numarul de pe pozitia "+i+" ");
            S=S+i;
            if (Numere[i]>max)
                max=Numere[i];
            if (Numere[i]<min)
                min=Numere[i];
            NumereDublate[++k]=Numere[i]*2;
        }
        System.out.println("Numarul maxim din sir este : "+max+"\n Numarul minim din sir este : "+min);
        System.out.println("Sirul introdus dublat : ");
        for (i=1;i<=k;i++)
            System.out.print(NumereDublate[i]+" ");
    }
}
