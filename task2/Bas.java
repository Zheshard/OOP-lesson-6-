package task2;

/*
 * Класс "Автобус" наследуется от базового класса Vehicle (транспортное средство)
 */
public class Bas extends Vehicle implements iSpeedCalculation {

	/**
	 * Конструктор "Автобус"
	 * 
	 * @param maxSpeed - максимальная скорость
	 */
	public Bas(int maxSpeed) {
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
		return this.getMaxSpeed() * 0.6;
	}

}
