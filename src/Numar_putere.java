public class Numar_putere
{
    public static void main(String[] args)
    {
        long Numar,Putere,i,NumarRidicat,ok=-1;
        Numar=SkeletonJava.readIntConsole("Dati numarul de ridicat la putere ");
        Putere=SkeletonJava.readIntConsole("Dati puterea la care se va ridica numarul introdus ");
        i=Putere;
        NumarRidicat=1;
        if (Numar==0 && Putere==0)
        {
            System.out.println("Nu se poate face ridicarea la putere \n ");
            ok=0;
        }
        if (Numar==0 && Putere!=0)
        {
            System.out.println("Numarul " + Numar + " la puterea " + Putere + " este 0");
            ok=0;
        }
        while (i>0 && ok!=0)
        {
            NumarRidicat=NumarRidicat*Numar;
            i--;
        }
        if (ok!=0)
        System.out.println("Numarul "+Numar+" ridicat la puterea "+Putere+" este : "+NumarRidicat+" ");
    }
}
