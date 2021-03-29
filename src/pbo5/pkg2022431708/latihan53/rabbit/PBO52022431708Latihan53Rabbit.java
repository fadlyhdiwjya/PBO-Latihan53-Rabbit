
package pbo5.pkg2022431708.latihan53.rabbit;

/**
 *
 * @author HP
 */
public class PBO52022431708Latihan53Rabbit {
    
    /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan nama Kelinci , makanan , warna kelinci
 *
 */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal(true, "grass", 4);
        
        Rabbit rabiit = new Rabbit("Petter", false, "grass", 4, "gray" );
        
        System.out.println("Hello, His name is "+rabiit.getName());
        System.out.println(rabiit.getName()+" is Vegetarian ? "+ false);
        System.out.println(rabiit.getName()+ " eats "+animal.getEats());
        System.out.println(rabiit.getName()+ " has "+animal.getNoOfLegs());
        System.out.println(rabiit.getName()+ " Color is  "+rabiit.getColor());


    }
}
    
