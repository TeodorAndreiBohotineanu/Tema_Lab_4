public class Suma_Primelor_N
{
    public static void main(String[] args)
    {
        int n,S=0;
        n=SkeletonJava.readIntConsole("Dati un numar ");
        S=n*(n+1)/2;
        System.out.println("Suma primelor n numere este "+S+"\n");
    }
}
