public class True_Or_False
{
    public static void main(String[] args)
    {
        int n,Inceput,Capat,FelInterval;
        n=SkeletonJava.readIntConsole("Dati un numar de verificat ");
        Inceput=SkeletonJava.readIntConsole("Dati primul capat al intervalului ");
        Capat=SkeletonJava.readIntConsole("Dati al doilea capat al intervalului ");
        FelInterval=SkeletonJava.readIntConsole("Ce fel de interval vreti sa fie? 1 -> Inchis, 0 -> Deschis ");
        if (FelInterval==1)
            if (n>=Inceput && n<=Capat)
                System.out.println("True");
            else System.out.println("False");
        else if (FelInterval==0)
            if (n>Inceput && n<Capat)
                System.out.println("True");
            else System.out.println("False");
    }
}
