import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    Phone phone = new Phone();
    Laptop laptop = new Laptop("Dell", 999.99, 16, "Large", true);
    Tablet tablet = new Tablet("Apple", 499.99, 4, "silver", 64);

    System.out.print("What brand of phone do you want? ");
    String newBrand = input.nextLine();
    phone.setBrand(newBrand);
    
    System.out.print("What brand of laptop do you want? ");
    String newLaptop = input.nextLine();
    laptop.setBrand(newLaptop);
    
    System.out.print("Do you want a touchscreen laptop (true or false)? ");
    boolean newTouchscreen = input.nextBoolean();
    laptop.setTouchscreen(newTouchscreen);

    System.out.print("Do you want a silver or rose-colored tablet? ");
    String newColor = input.next();
    tablet.setColor(newColor);

    System.out.print("Do you want 32GB or 64GB of storage? ");
    int newStorage = input.nextInt();
    tablet.setStorage(newStorage);

    System.out.println();
    System.out.println("Phone");
    System.out.println("----------------");
    System.out.println(phone);
    System.out.println();

    System.out.println("Laptop");
    System.out.println("----------------");
    System.out.println(laptop);
    System.out.println();
    
    System.out.println("Tablet");
    System.out.println("----------------");
    System.out.println(tablet);
  }
}