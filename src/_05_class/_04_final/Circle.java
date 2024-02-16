package _05_class._04_final;

import java.util.Scanner;

public class Circle {
    private final int radius;

    private static final double PI = 3.141592;

    public Circle(int radius) {
        this.radius = radius;
    }
    ////////////////////////////
    // 메서드는 이렇게 만들면 된다
    public double calculateArea() {
        return radius * radius * PI;
    }
    /////////////////////////////
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        // Circle 객체 생성
        Circle circle = new Circle(radius);

        System.out.println("원의 반지름을 입력하세요 : " + circle.radius);
        System.out.println("원의 반지름 = " + circle.radius);
        System.out.println("원의 넓이 : " + circle.calculateArea());
        scanner.close();
    }


}
