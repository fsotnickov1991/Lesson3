package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите любое число: ");
            int num = in.nextInt();
            if (num != 0) {
                switch (num) {
                    case 1: {
                        double x1 = in.nextDouble();
                        double x2 = in.nextDouble();
                        double a = Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
                        System.out.printf("a= %f", a);
                    }
                    break;
                    case 2: {
                        double x1 = in.nextDouble();
                        double x2 = in.nextDouble();
                        double x3 = in.nextDouble();
                        double a = x1 * x2 + x1 * x3 + x2 * x3;
                        System.out.printf("a= %f", a);
                    }
                    break;
                    case 3: {
                        double v0 = in.nextDouble();
                        double t = in.nextDouble();
                        double a = in.nextDouble();
                        double b = v0 * t + (a * (Math.pow(t, 2))) / 2;
                        System.out.printf("b= %f", b);
                    }
                    break;
                    case 4: {
                        double m = in.nextDouble();
                        double v = in.nextDouble();
                        double g = in.nextDouble();
                        double h = in.nextDouble();
                        double k = (m * (Math.pow(v, 2)) / 2) + (m * g * h);
                        System.out.printf("k= %f", k);
                    }
                    break;
                    case 5: {
                        double R1 = in.nextDouble();
                        double R2 = in.nextDouble();
                        double a = (1 / R1) + (1 / R2);

                        System.out.printf("a= %f", a);
                    }
                    break;
                    case 6: {
                        double m = in.nextDouble();
                        double a = in.nextDouble();
                        double g = in.nextDouble();
                        double b = (m * g * (Math.cos(a)));
                        System.out.printf("b= %f", b);
                    }
                    break;
                    case 7: {
                        double R = in.nextDouble();
                        double m = 2 * Math.PI * R;
                        System.out.printf("m= %f", m);
                    }
                    break;
                    case 8: {
                        double b = in.nextDouble();
                        double a = in.nextDouble();
                        double c = in.nextDouble();
                        double m = Math.pow(b, 2) - 4 * a * c;
                        System.out.printf("m= %f", m);
                    }
                    break;
                    case 9: {
                        double y = in.nextDouble();
                        double m1 = in.nextDouble();
                        double m2 = in.nextDouble();
                        double r = in.nextDouble();
                        double x = y * ((m1 * m2) / Math.pow(r, 2));
                        System.out.printf("x= %f", x);
                    }
                    break;
                    case 10: {
                        double I = in.nextDouble();
                        double R = in.nextDouble();
                        double x = Math.pow(I, 2) * R;
                        System.out.printf("R= %f", R);
                    }
                    break;
                    case 11: {
                        double a = in.nextDouble();
                        double b = in.nextDouble();
                        double c = in.nextDouble();
                        double x = a * b * Math.sin(c);
                        System.out.printf("x= %f", x);
                    }
                    break;
                    case 12: {
                        double a = in.nextDouble();
                        double b = in.nextDouble();
                        double c = in.nextDouble();
                        double x = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(c));
                        System.out.printf("x= %f", x);
                    }
                    break;
                    case 13: {
                        double a = in.nextDouble();
                        double b = in.nextDouble();
                        double c = in.nextDouble();
                        double d = in.nextDouble();
                        double x = (a * d + b * c) / a * d;
                        System.out.printf("x= %f", x);
                    }
                    break;
                    case 14: {
                        double x = in.nextDouble();
                        double y = Math.sqrt(1 - Math.pow(Math.sin(x), 2));
                        System.out.printf("y= %f", y);
                    }
                    break;
                    case 15: {
                        double a = in.nextDouble();
                        double b = in.nextDouble();
                        double c = in.nextDouble();
                        double x = in.nextDouble();
                        double d = (1 / Math.sqrt(a * Math.sqrt(x) + b * x + c));
                        System.out.printf("d= %f", d);
                    }
                    break;
                    case 16: {
                        double x = in.nextDouble();
                        double y = (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / 2 * Math.sqrt(x);
                        System.out.printf("y= %f", y);
                    }
                    break;
                    case 17: {
                        double x = in.nextDouble();
                        double y = (Math.abs(x) + Math.abs(x + 1));
                        System.out.printf("y= %f", y);
                    }
                    break;
                    case 18: {
                        double x = in.nextDouble();
                        double y = Math.abs(1 - (Math.abs(x)));
                        System.out.printf("y= %f", y);
                    }
                    break;

                    default:
                        System.out.println("число не равно 1, 8, 9");


                }
            } else {
                System.out.println("Окончание работы");
                in.close();
                break;
            }

        }
    }
}