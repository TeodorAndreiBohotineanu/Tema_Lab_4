public class TVA
{
    public static void main(String[] args)
    {
        int Pret;
        double TVA;
        Pret=SkeletonJava.readIntConsole("Dati pretul in RON al unui produs ");
        TVA=(double)Pret*19/100;
        System.out.println("Pretul introdus contine "+TVA+" RON TVA");
    }
}
