//Money Management System for School
public class Driver {
	public static void main(String[] args) {
		//Teachers
		Staff t1 = new Teacher("Ali",1,5000);
		Staff t2 = new Teacher("Hassan",2,5000);
		Staff t3 = new Teacher("Hussain",3,5000);
		Staff t4 = new Teacher("Zahra",4,5000);
		
		//Security
		Staff d1 = new Security("Umar",1,1000);
		Staff d2 = new Security("Abu Bakr",2,1000);
		Staff d3 = new Security("Usman",3,1000);
		
		//Students
		Student s1 = new Student(1,"Murtaza",6);
		Student s2 = new Student(2,"Rehan",6);
		Student s3 = new Student(3,"Osaaf",5);
		Student s4 = new Student(4,"Muntzir",4);
		
		Bill b1 = new ElectricityBill(15000);
		Bill b2 = new WaterBill(5000);
		Bill b3 = new GasBill(8000);
		
		School school = new School();
		//Adding Students
		school.addStudent(s1);
		school.addStudent(s2);
		school.addStudent(s3);
		school.addStudent(s4);
		school.displayStudents();
		//Adding Teachers
		school.addStaff(t1);
		school.addStaff(t2);
		school.addStaff(t3);
		school.addStaff(t4);
		
		//Adding Security Staff
		school.addStaff(d1);
		school.addStaff(d2);
		school.addStaff(d3);
		
		school.displayStaff();
		
		//Students Paying Fee
		school.payFee(s1,5000);
		school.payFee(s2,3000);
		school.payFee(s3,7000);
		school.payFee(s4,2000);
		
		System.out.println(school.getremainingFunds());
		//Teacher Salary
		school.paySalary(t1);
		school.paySalary(t2);
		school.paySalary(t3);
		school.paySalary(t4);
		
		System.out.println(school.getremainingFunds());
		
		//Security Salary
		school.paySalary(d1);
		school.paySalary(d2);
		school.paySalary(d3);
		
		System.out.println(school.getremainingFunds());
		
		//Pay Bills
		school.payBill(b1);
		school.payBill(b2);
		school.payBill(b3);
		
		//Student Fees
		school.payFee(s1,15000);
		school.payFee(s2,13000);
		school.payFee(s3,17000);
		school.payFee(s4,6000);
		
		System.out.println(school.getremainingFunds());
	}
}	
/*
Keep a track of student fee
fee already paid
Staff salary
*/

/*
School
Staff,
Students,
Total money earned(fees paid)
Total money spent(Staff salary)
Bill
*/

/*
Staff
Teachers(Name ID Salary)
Security(Name ID Salary)
Cleaning(Name ID Salary)
Principal(Name ID Salary)

*/

/*
 Student
 (Name ID Grade feespaid feestotal) 
*/

/*
Bill
Electricity
Water
Gas
*/