public class Penguin {
    private int positionX;

    public Penguin(int positionX) {
        this.positionX = positionX;
    }

    public void fly() {
        positionX++;
    }

    public int getPositionX() {
        return positionX;
    }
}