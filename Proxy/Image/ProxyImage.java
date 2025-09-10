package Proxy.Image;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        else {
            System.out.println("loading img from cache");
        }
        realImage.display();
    }
}
