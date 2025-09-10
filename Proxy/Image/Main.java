package Proxy.Image;

public class Main {
    public static void main(String[] args) {
        Image img = new ProxyImage("my_pic.png");
        img.display();
        img.display();
    }
}
