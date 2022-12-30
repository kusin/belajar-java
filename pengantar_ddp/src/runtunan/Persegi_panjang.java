// deklarasi package
package runtunan;

// deklarasi pustaka
import java.util.Scanner;

// main class
public class Persegi_panjang {
    
    //main method
    public static void main(String[]args){
        
        // deklarasi obj scanner
        Scanner obj = new Scanner(System.in);
        
        // deklarasi variabel
        double panjang, lebar, luas;
        
        // masukan program
        System.out.print("Masukan panjang : ");
        panjang = obj.nextDouble();
        
        System.out.print("Masukan lebar : ");
        lebar = obj.nextDouble();
        
        // proses program
        luas = panjang * lebar;
        
        // keluaran program
        System.out.println("Luas persegi panjang : "+luas);
    }
}
