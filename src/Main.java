public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Line(), new Square(), new Lightning()};

        for (int i = 0; i < figures.length; i++) {
            System.out.println("*****");

            figures[i].moveLeft();
            figures[i].moveRight();
            figures[i].rotate();
            figures[i].moveDown();

            System.out.println("*****");
        }
    }
}
