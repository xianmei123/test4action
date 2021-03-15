public class CuboidBox {
    private double length;
    private double width;
    private double height;
    private double ttVolume = 0.0;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double get_ttVolume() {
        return ttVolume;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void set_ttVolume(double ttVolume) {
        this.ttVolume = ttVolume;
    }

    public CuboidBox(double length, double width, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getVolume() {
        double vol;
        vol = length * width * height;
        return vol;
    }
}