package task_1;

import java.sql.Date;

/**
 * Проверка работы кода
 */
public class test1 {
	public static void main(String[] args) {

		Date date = new Date(95, 00, 04);
		Employee emp1 = new Employee("Ivan", date, 40000);
		CalculateNetSalaryService calc1 = new CalculateNetSalaryService();
		calc1.calculateNetSalary(emp1.getBaseSalary());
		System.out.println(emp1.getEmpInfo() + " Salary - " + calc1.calculateNetSalary(emp1.getBaseSalary()));
	}
}
