package pl.sdacademy.tarr4;
//generate test
//alt + enter
public class App {

    //code format
    //ctrl+alt+L

    // alt + insert + enter
    // generate code

    //psvm + tab
    public static void main(String[] args) {
        //sout + tab
        System.out.println("Witaj Świecie !");

        int number = 2019;

        int number2;
        number2=2020;

        System.out.println(number);
        System.out.println(number2);

        int pojemnik;
        pojemnik = sumaLiczb(1,2,3);// wywołanie metody sumaLiczb
        System.out.println(pojemnik);
        System.out.println(suma2Liczb(1,2));

        Kawa mojaKawa = new Kawa();// użycie konstruktora domyślnego

    }

    static int sumaLiczb(int a, int b, int c){
        return a+b+c;
    }

    static int suma2Liczb(int a, int b){
        return a+b;
    }
}
