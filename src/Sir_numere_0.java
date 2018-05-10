public class Sir_numere_0
{
    public static void main(String[] args)
    {
        int []Numere = new int [1000];
        int numere,S=0;
        numere=SkeletonJava.readIntConsole("Dati primul numar ");
        while (numere!=0 && numere>=0)
        {
            if (numere>4 && numere <11)
                S=S+numere;
            numere=SkeletonJava.readIntConsole("Dati urmatorul numar ");
        }
        System.out.println("Suma numerelor din intervalul (4,11) este : "+S+" ");
    }
}
