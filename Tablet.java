public class Tablet extends Phone{

  private String color;
  private int storage;

  public Tablet(){
    super();
    color = "silver";
    storage = 64;
  }

  public Tablet(String brand, double price, int memory, String color, int storage){
    super(brand, price, memory);
    this.color = color;
    this.storage = storage;
  }

  public String getColor(){
    return color;  }

  public int getStorage(){
    return storage;
  }

  public void setColor(String newColor){
    color = newColor;
  }

  public void setStorage(int newStorage){
    storage = newStorage;
  }

  public String toString() {
    return super.toString() + "\nColor: " + color + "\nStorage: " + storage + "GB";
  }
}