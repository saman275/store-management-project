public class Phone {

  private String brand;
  private double price;
  private int memory;

  public Phone(){
    this("Samsung", 799.99, 8);
  }
  
  public Phone(String brand, double price, int memory){
    this.brand = brand;
    this.price = price;
    this.memory = memory;
  }

  public String getBrand(){
    return brand;
  }

  public double getPrice(){
    return price;
  }

  public int getMemory(){
    return memory;
  }

  public void setBrand(String newBrand){
    brand = newBrand;
  }

  public void setPrice(double newPrice){
    price = newPrice;
  }

  public void setMemory(int newMemory){
    memory = newMemory;
  }

  public String toString(){
    return "Brand: " + brand + "\nPrice: " + price + "\nMemory: " + memory + "GB";
  }
}

