package task3;

// 3) Переписать код в соответствии с Interface Segregation Principle:
// public interface Shape {
// double area();
// double volume();
// }
// public class Circle implements Shape {
// private double radius;
// public Circle(double radius) {
// this.radius = radius;
// }
// @Override
// public double area() {
// return 2 * 3.14 * radius;
// }
// @Override
// public double volume() {
// throw new UnsupportedOperationException();
// }
// }
// public class Cube implements Shape {
// private int edge;
// public Cube(int edge) {
// this.edge = edge;
// }
// @Override
// public double area() {
// return 6 * edge * edge;
// }
// @Override
// public double volume() {
// return edge * edge * edge;
// }
// }

// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

public class test3 {
	public static void main(String[] args) {

		Cube cube1 = new Cube(5);
		System.out.println("Площадь куба: " + cube1.area());
		System.out.println("Объем куба: " + cube1.volume());
		System.out.println("--------------------");
		Circle circle1 = new Circle(5);
		System.out.println("Площадь круга: " + circle1.area());
	}
}
