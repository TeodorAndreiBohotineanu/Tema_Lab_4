public class Fahrenheit_to_Celsius
{
    public static void main(String[] args)
    {
        float Fah;
        Fah=SkeletonJava.readIntConsole( "Dati numarul de grade in Fahrenheit ");
        System.out.println(Fah+" in Fahrenheit corespunde "+((float)((Fah-32)*5/9))+" grade Celsius ");
    }
}
