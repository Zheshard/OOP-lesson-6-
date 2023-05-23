
package task_1;

/**
 * Начисление зарплаты с учетом вычета налога
 */
public class CalculateNetSalaryService {

	/**
	 * Метод вычисления заработной платы после вчета налога
	 * 
	 * @param baseSalary - зарплата до вычета налога
	 * @return получить чистую зарплату
	 */
	public int calculateNetSalary(int baseSalary) {
		int tax = (int) (baseSalary * 0.13);// calculate in otherway
		return baseSalary - tax;
	}
}