public class Km_M_pe_Secunda
{
    public static void main(String[] args)
    {
        int Viteza;
        double Rezultat;
        Viteza=SkeletonJava.readIntConsole("Dati viteza testoasei in km/h");
        Rezultat=(double)Viteza*1000/3600;
        System.out.println("Viteza convertita din km/h in m/s este : "+Rezultat+" ");
    }
}
