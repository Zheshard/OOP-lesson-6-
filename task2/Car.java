package task2;

/*
 * Класс "Автомобиль" наследуется от базового класса Vehicle (транспортное средство)
 */
public class Car extends Vehicle implements iSpeedCalculation {

	/**
	 * Конструктор "Автомобиль"
	 * 
	 * @param maxSpeed - максимальная скорость
	 */
	public Car(int maxSpeed) {
		super(maxSpeed);
		super.type = "Bas";
	}

	/**
	 * Метод вычисления допустимой скорости (интерфейс SpeedCalculation)
	 * 
	 * @return - возвращает рассчитанное значение типа double
	 */
	@Override
	public double calculateAllowedSpeed() {
		return this.getMaxSpeed() * 0.8;
	}
}
