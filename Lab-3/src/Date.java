
public class Date {
private int Date;
private int Month;
private int Year;
public Date(int Date,int Month,int Year) {
	this.Date=Date;
	this.Month=Month;
	this.Year=Year;
}
public int getDate() {
	return Date;
}
public void setDate(int da) {
	
	Date = da;
}
public int getMonth() {
	return Month;
}
public void setMonth(int mo) {
	Month = mo;
}
public int getYear() {
	return Year;
}
public void setYear(int ye) {
	Year = ye;
}
public String toString() {
	return "Doj:" +this.Date +"-"+ this.Month + "-"+ this.Year;
}
	
}
