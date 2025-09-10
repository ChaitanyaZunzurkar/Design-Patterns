package Proxy.Image;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImg();
    }

    public void loadImg() {
        System.out.println("Loading " + fileName + " from the ROM");
    }

    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
