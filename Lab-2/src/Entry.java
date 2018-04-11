import static java.lang.System.out;

class Entry{
	
	
	public static void main(String[] args){
		out.println("Employee details");
		
		Employee e = null;
		Date d=null;

		 d=new Date(22,06,2017);

		e = new Employee("LOHIT","TRIPURARI",22000,"A",d);
		e.displayDetails();

		d=new Date(22,06,1983);
               e = new Employee("GANDHI","TRIPURARI",22344,"A",d);
	       e.displayDetails();
	       d=new Date(22,10,2007);
               e = new Employee("KIRAN","MOGANTI",190000,"A",d);
		e.displayDetails();
		d=new Date(22,10,2014);
        e = new Employee("MEGHANA","MOGANTI",40000,"A",d);
		e.displayDetails();
		
		
		
	}
	
	
}







