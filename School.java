import java.util.ArrayList;

public class School {
	
	
	private ArrayList<Student> st_list = new ArrayList<>();
	private ArrayList<Staff> emp_list = new ArrayList<>();
	private String name;
	
	protected int moneyEarned;
	protected int moneySpent;
	protected int remainingFunds;
	
	public int getMoneyEarned() {
		return moneyEarned;
	}
	
	public int getMoneySpent() {
		return moneySpent;
	}
	
	public int getremainingFunds() {
		return remainingFunds;
	}
	
	public String getSchoolName() {
		return this.name;
	}
	
	public void setSchoolName(String s) {
		this.name = s;
	}
	
	public void addStudent(Student s) {
		st_list.add(s);
	}
	
	public void addStaff(Staff s) {
		emp_list.add(s);
	}
	
	public void displayStaff() {
		for (int i=0;i<emp_list.size();i++) {
			System.out.println(emp_list.get(i).getName());
			System.out.println(emp_list.get(i).getID());
			System.out.println();
		}
	}
	
	public void displayStudents() {
		for (int i=0;i<st_list.size();i++) {
			System.out.println(st_list.get(i).getName());
			System.out.println(st_list.get(i).getID());
			System.out.println();
		}
	}
	
	public void paySalary(Staff s) {
		moneySpent += s.getSalary();
		remainingFunds -= s.getSalary();
	}
	
	public void payFee(Student s, int fee) {
		
		if(s.getTotalFee() != 0) {
			s.setPaidFee(s.getPaidFee() + fee);
			System.out.println(s.getPaidFee() + " paid");
			s.remainingFee();
			moneyEarned += s.getPaidFee();
			remainingFunds += s.getPaidFee();
		}
	}
	
	public void payBill(Bill b) {
		moneySpent += b.getCost();
		remainingFunds -= b.getCost();
	}
}
