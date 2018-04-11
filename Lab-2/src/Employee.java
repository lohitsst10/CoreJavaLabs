class Employee{
	
private String firstName; 
private String lastName; 
private double salary;
Date doj;
private String grade;
static int count; 
private int id;

	
	
	
	
	
	public Employee(String firstName,String lastName,double salary,String grade,Date doj) {
		
		this.firstName = firstName; 
this.lastName = lastName; 
this.salary = salary;
this.grade = grade; 
this.doj = doj; 
id = ++count; 
	}
	
	public void displayDetails(){
		System.out.println("\n*************************");
System.out.print("\nid: "+ id);
		System.out.println("\nfirstname: "+ firstName);
		System.out.println("\nlastName: "+ lastName);
System.out.println("\nsalary: "+ salary);
System.out.println("\ngrade: "+ grade);
		System.out.println("\ndoj: "+ doj);
System.out.println("\n*************************");
		
	}
	
	
	
	
	
	
}








