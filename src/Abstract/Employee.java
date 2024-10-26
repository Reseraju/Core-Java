//Employee(abstract)
//  		 EmpId
//   		Name
//    		salary 
//    		Bonus 
//          abstract     calBon()
//          show()
// 
// 
//Permanent emp                                 Temporaray
//10%                                                            5%
// 
//abstract class Employee
//{
//             EmpId
//   		Name
//    		salary 
//    		Bonus
//abstract void calBon();
//void show()
//{
//    sop(empid name salary bonus)
//}
//}
// 
//class Permanent extends Employee
//{
//void calBon()
//{
//Bonus=sal*10/100;
//}
// 
//}
// 
// 
//class Temporary  extends Employee
//{
//void calBon()
//{
//Bonus=sal*5/100;
//}
// 
//}
//class Demo
//{
// 
//  main()
//{
//Employee emp;
//   sop("1....temp")
//   sop(2.....per")
//  if(ch==1)
//{
//emp= new  Temporary();
//emp.calBon();
//emp.show()
// 
//}
// 
//else if(ch==2)
//{
//emp= new  Permanent();
//emp.calBon();
//emp.show()
// 
//}
// 
//}


package Abstract;

public abstract class Employee {
	private String empID;
	private String name;
	private int salary;
	private int bonus;
	
	public String getEMpID() {
		return empID;
	}
	
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
	
	//abstract methos
	public abstract  void show() ;
	public abstract void  calBonus();
}
