public class Bird {
    private int height;

    public Bird(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void fly() {
        this.height++;
    }
}
