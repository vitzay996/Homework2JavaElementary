package com.vitzay.task2;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);
    static PointList POINT_LIST = new PointList();
    public static void main(String[] args) {
        POINT_LIST.add(enterPoint());
        enterNextPoint();

        System.out.println("Необходимо указать параметры окружности: точку центра и радиус: ");
        Circle circle = new Circle(enterPoint(), enterRadius());

        System.out.println("точки что лежат в окружности: ");
        for (int i = 0; i < POINT_LIST.size(); i++) {
            if (circle.containsPoint(POINT_LIST.get(i))) {
                System.out.println(POINT_LIST.get(i));
            }
        }
    }
    public static Point enterPoint() {
        System.out.println("введите координаты точки: ");
        System.out.print("x: ");
        double x = SCANNER.nextDouble();
        System.out.print("y: ");
        double y = SCANNER.nextDouble();
        return new Point(x, y);
    }


    public static void enterNextPoint() {
        m:
        while (true) {
            System.out.println("Желаете добавить еще (1 - да 2 - нет)");
            int variant = SCANNER.nextInt();
            System.out.println("ваш выбор: " + variant);
            switch (variant) {
                case 1:
                    POINT_LIST.add(enterPoint());
                    break;
                case 2:
                    break m;
                default:
                    System.out.println("неверный ввод");
                    break;
            }
        }
    }

    public static double enterRadius() {
        System.out.println("введите радиус окружности: ");
        System.out.print("r: ");
        return SCANNER.nextDouble();
    }
}
