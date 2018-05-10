public class Ma_2_Numere {
    public static void main(String[] args) {
        int FirstNumber, SecondNumber, S = 0;
        double Ma;
        FirstNumber = SkeletonJava.readIntConsole("Dati primul numar : ");
        SecondNumber = SkeletonJava.readIntConsole("Dati al doilea numar : ");
        S = FirstNumber + SecondNumber;
        Ma = (double) S / 2;
        System.out.println("Media aritmetica a numerelor " + FirstNumber + " si " + SecondNumber + " este : " + Ma);
    }
}
