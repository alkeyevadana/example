package com.dana;
public class Main {
    public static void main(String[] args){
        Circle circ = new Circle();
        Rectangle rec = new Rectangle();
        Square sq = new Square();

        System.out.println(circ.toString());
        System.out.println("The area of circle = "+circ.getArea());
        System.out.println("The perimeter of circle = "+circ getPerimeter());

        System.out.println(rec.toString());
        System.out.println("The area of rectangle = "+rec.getArea());
        System.out.println("The perimeter of rectangle = "+rec getPerimeter());

        System.out.println(sq.toString());
        System.out.println("The area of square = "+sq.getArea());
        System.out.println("The perimeter of square = "+sq getPerimeter());
    }
}

