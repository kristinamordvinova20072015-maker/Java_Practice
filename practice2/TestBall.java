package practice2.s;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(1.0, 2.0);
        System.out.println("Начальное положение: " + ball);
        ball.move(2.5, -1.5);
        System.out.println("После перемещения: " + ball);
        ball.setXY(0.0, 0.0);
        System.out.println("После установки новых координат: " + ball);
    }
}
