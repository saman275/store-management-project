public class Laptop extends Phone{

  private String size;
  private boolean touchscreen;

  public Laptop(){
    super();
    size = "medium";
    touchscreen = false; 
  }

  public Laptop(String brand, double price, int memory, String size, boolean touchscreen){
    super(brand, price, memory);
    this.size = size;
    this.touchscreen = touchscreen;
  }

  public String getSize(){
    return size;
  }

  public boolean isTouchscreen(){
    return touchscreen;
  }

  public void setTouchscreen(boolean newTouchscreen){
    touchscreen = newTouchscreen;
  }

  public void setSize(String newSize){
    size = newSize;
  }

  public String toString() {
    return super.toString() + "\nSize: " + size + "\nTouchscreen: " + touchscreen;
  }
}
