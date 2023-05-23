package task2;

/**
 * Интерфейс вычисления допустимой скорости
 */
public interface iSpeedCalculation {
	/**
	 * Метод вычисления допустимой скорости
	 * 
	 * @param vehicle - транспортное средсвто
	 * @return - возвращает рассчитанное значение типа double
	 */
	public double calculateAllowedSpeed();
}
