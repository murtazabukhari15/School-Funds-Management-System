

public class Student extends School {
	private int id;
	private String name;
	private int grade;
	private int paidFee;
	private int totalFee;
	
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.setPaidFee(0); //Initially the fee would be 0
		this.totalFee = 150000; //Fee per year
	}
	
	
	
	public int getID() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getGrade() {
		return grade;
	}



	public void updateGrade() {
		this.grade += 1;
	}

	
	public int getTotalFee() {
		return this.totalFee;
	}
	
	
	public void payFee(int fee) {
		
		if(this.totalFee != 0) {
			this.setPaidFee(this.getPaidFee() + fee);
			System.out.println(this.getPaidFee() + " paid");
			remainingFee();
			moneyEarned += this.getPaidFee();
			remainingFunds += this.getPaidFee();
		}
	}
	
	public int remainingFee() {
		this.totalFee = this.totalFee - this.getPaidFee();
		return this.totalFee;
	}
	
	public void displaySudentDetails(){
		
			System.out.println("ID: "+this.id);
			System.out.println("Name: "+this.name);
			System.out.println("Grade: "+this.grade);
			System.out.println("Fee Paid: "+this.getPaidFee());
			System.out.println("Remainig Fee: "+this.totalFee);
		
	}



	public int getPaidFee() {
		return paidFee;
	}



	public void setPaidFee(int paidFee) {
		this.paidFee = paidFee;
	}
	

	
}
