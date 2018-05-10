public class Factorial
{
    public static void main(String[] args)
    {
        long Numar,Factorial=1;
        int i;
        Numar=SkeletonJava.readIntConsole("Dati un numar ");
        for (i=1;i<=Numar;i++)
            Factorial=Factorial*i;
        System.out.println(Numar+" factorial este : "+Factorial);
    }
}
