public class Square {

    private int width;

    public Square(int width) {
        this.width = width;
    }

    public int computeArea() {
        if (this.width <= 0) {
            return -1;
        }
        return this.width * this.width;
    }
}
