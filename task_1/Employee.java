package task_1;
// 1) Переписать код в соответствии с Single Responsibility Principle:

// Подсказка: вынесите метод calculateNetSalary() в отдельный класс

import java.sql.Date;

/**
 * Класс "Работник"
 */
public class Employee {
	private String name;
	private Date dob;
	private int baseSalary;

	/**
	 * Конструктор "Работник" с 3 параметрами
	 * 
	 * @param name       - имя работника
	 * @param dob        - дата трудоустройства
	 * @param baseSalary - зарплата до вычета налога
	 */
	public Employee(String name, Date dob, int baseSalary) {
		this.name = name;
		this.dob = dob;
		this.baseSalary = baseSalary;
	}

	/**
	 * 
	 * @return получить зарплату работника
	 */
	public int getBaseSalary() {
		return this.baseSalary;
	}

	/**
	 * 
	 * @return получить информацию о работнике
	 */
	public String getEmpInfo() {
		return "name - " + this.name + " , dob - " + dob.toString() + ", baseSalary - " + baseSalary;
	}
}
