package com.mpp.assignment3_3;

public class Main {
	public static void main(String args[]) {
		Company co = new Company("M&K");

		Department marketing = new Department("Marketing and HR", "Nepal", co);
		Department it = new Department("IT", "Nepal", co);
		Department finance = new Department("Finance", "Nepal", co);
		Department management = new Department("Management", "Nepal", co);

		Position ceo = new Position("CEO", "Head of Organisation", management);

		Position managerMhr = new Position("Manager Marketing & HR", "Manager Marketing", marketing);
		Position managerIt = new Position("Manager IT", "Manager IT", it);
		Position managerFinance = new Position("Manager Finance", "Manager Finance", finance);

		Position software = new Position("Software", "Develop Software", it);
		software.setSuperior(managerIt);
		Position hardware = new Position("Hardware", "Fix hardware problem", it);
		hardware.setSuperior(managerIt);
		Position reporter = new Position("Reporter", "Generate Reports", finance);
		reporter.setSuperior(managerFinance);
		Position cash = new Position("Cash", "checks cah flow", finance);
		cash.setSuperior(managerFinance);
		Position recruiter = new Position("Recruiter", "Recruit Employeee", marketing);
		recruiter.setSuperior(managerMhr);
		Position adver = new Position("Advertiser", "Advetise the Product", marketing);
		adver.setSuperior(managerMhr);

		managerMhr.setSuperior(ceo);
		managerMhr.addInferiorPosition(recruiter);
		managerMhr.addInferiorPosition(adver);

		managerIt.setSuperior(ceo);
		managerIt.addInferiorPosition(software);
		managerIt.addInferiorPosition(hardware);

		managerFinance.setSuperior(ceo);
		managerFinance.addInferiorPosition(cash);
		managerFinance.addInferiorPosition(reporter);

		Employee madan = new Employee(1, "Madan", "Krishna", "Siwakoti", "1988/07/25", "001", 1000.10, ceo);
		Employee hari = new Employee(2, "Hari", "", "Niraula", "1988/07/25", "002", 2000.10, managerMhr);
		Employee gunjan = new Employee(3, "Gunjan", "", "Shakya", "1988/07/25", "003", 1500.10, managerIt);
		Employee govinda = new Employee(4, "Govinda", "", "Basnet", "1988/07/25", "004", 1400.10, managerFinance);
		Employee sabina = new Employee(5, "Sabina", "", "Acharya", "1988/07/25", "005", 1600.10, recruiter);
		Employee niru = new Employee(6, "Niru", "", "Acharya", "1988/07/25", "006", 1500.10, adver);
		Employee siru = new Employee(7, "Srijana", "", "Chapagain", "1988/07/25", "007", 1000.10, software);
		Employee keshav = new Employee(8, "Keshav", "Shahi", "Siwakoti", "1988/07/25", "008", 2300.10, hardware);
		Employee prabin = new Employee(9, "Prabin", "Sharma", "Dahal", "1988/07/25", "009", 2000.10, cash);
		Employee manoj = new Employee(10, "Manoj", "Kumar", "Siwakoti", "1988/07/25", "0010", 1100.10, adver);
		Employee rajiv = new Employee(11, "Rajiv", "", "Maharjan", "1988/07/25", "0011", 1200.10, reporter);
		
	}

}
