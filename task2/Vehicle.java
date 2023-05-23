package task2;

/**
 * Класс "Транспортное средство"
 */
public class Vehicle {
	private int maxSpeed;
	protected String type;

	/**
	 * Конструктор "транспортное стредсвто"
	 * 
	 * @param maxSpeed - максимальная скорость ТС
	 */
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	/**
	 * 
	 * @return Получить максимальную скорость ТС
	 */
	public int getMaxSpeed() {
		return this.maxSpeed;
	}

	/**
	 * Получить тип ТС
	 * 
	 * @return
	 */
	public String getType() {
		return this.type;
	}

}
