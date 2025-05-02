package Kim;

import java.util.Scanner;//show doc

public class Unit2program1 {
    public static void main(String[] args) {
        car myfirstcar = new car("Ford","F-150",2023,1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find your next car!");
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Year: ");
        int year = scanner.nextInt();
        System.out.print("Mileage: ");
        int mileage = scanner.nextInt();
        car mysecondcar = new car(brand, model, year, mileage);
        System.out.println("mysecondcar: "+mysecondcar);
        car mythirdcar = mysecondcar;
        System.out.println("mythirdcar"+mythirdcar);
        System.out.println("Wiping data");
        mysecondcar = null;
        System.out.println("mysecondcar: "+mysecondcar);
        System.out.println("mythirdcar: "+mythirdcar);
        System.out.println("third car cost: "+mythirdcar.calculatevalue());
        System.out.println("yay");
        mythirdcar.honk();
        mythirdcar.honk("Quack");
        System.out.println(mythirdcar.returnid());

    }
    
}
class car{
    private String brand, model; // show that String is final
    private int year, mileage;
    public car(String brand, String model, int year, int mileage){
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.mileage=mileage;
    }
    public car(String brand, String model){
        this.brand=brand;
        this.model=model;
        this.year=-1;
        this.mileage=-1;
    }
    public String getbrand(){return brand;}
    public String getmodel(){return model;}
    public int getyear(){return year;}
    public int getmileage(){return mileage;}
    public String toString(){return("\nBrand: "+getbrand()+"\nModel: "+
                getmodel()+"\nYear: "+getyear()+"\nMileage: "+getmileage());}
    public int calculatevalue(){return 50000-mileage+year;}
    public static void honk(){System.out.println("HHHHOOOOOONNNNNNKKKKK");}
    public static void honk(String phrase){System.out.println(phrase.repeat(5));}
    public String returnid(){return getbrand().substring(0,1)+
                getmodel().substring(0, 2)+getyear();}
}