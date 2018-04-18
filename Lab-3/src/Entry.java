//package com.cg;

public class Entry {
public static void main(String[] args) {
	Date d=null;
	/*d.setDate(22);
	d.setMonth(11);
	d.setYear(2016);*/
	d=new Date(22,11,2017);
	Employee e = new Employee("Lohit",20000.00);
	Employee e1 = new Employee("Pavan",21000.00);
	System.out.println("Employee name is "+e.getName()+ " salary is "+e.getSalary());
	System.out.println("Employee name is "+e1.getName()+ " salary is "+e1.getSalary());
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	
	
	PermanentEmployee p = new PermanentEmployee("Pawan",3000.00);
	PermanentEmployee p1 = new PermanentEmployee("Suresh",2000.00);
	PermanentEmployee p2 = new PermanentEmployee("Mahesh",5000.00);

	System.out.println("Permanent Employees count is: "+PermanentEmployee.count);
	System.out.println("----------------------------------------------------------");
	System.out.println( "Name of Employee is :"+p.getName()+ " \nSalary is :"+p.getSalary() );
    System.out.println( "Name of Employee is : "+p1.getName()+ "\nSalary is "+p1.getSalary()  );
    System.out.println( "Name of Employee is : "+p2.getName()+ "\nSalary is "+p2.getSalary()  );

    System.out.println("############################################################");

	Contractor con = new Contractor("Ananya",1000.00);
	ContractEmployee c = new ContractEmployee(8);
	c.setContractor(con);
	c.getContractor();
	Contractor con1 = new Contractor("Ishika",1000.00);
	ContractEmployee c1 = new ContractEmployee(6);
	c1.setContractor(con1);
	c1.getContractor();
	//c.getContractor();
	System.out.println("Contract employee count is "+ContractEmployee.count);
	System.out.println("----------------------------------------------------------");

	System.out.println("\nName of Employee is :"+con.getName()+" \nSalary is "+c.getSalary());
	System.out.println("\nName of Employee is :"+con1.getName()+" \nSalary is "+c1.getSalary());



	
}
}
