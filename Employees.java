
public class Employees {
int eid;
String ename;
double esalary;
String eemail;
String edept;
public int geteid() {
	return eid;
}
public void seteid(int eid) {
	this.eid = eid;
}
public String getename() {
	return ename;
}
public void setename(String ename) {
	this.ename = ename;
}
public double getesalary() {
	return esalary;
}
public void setesalary(double esalary) {
	this.esalary = esalary;
}
public String geteemail() {
	return eemail;
}
public void seteemail(String eemail) {
	this.eemail = eemail;
}
public String getedept() {
	return edept;
}
public void setedept(String edept) {
	this.edept = edept;
}
public static void main(String[]args) {
	Employees e1 = new Employees();
	e1.seteid(201);
	e1.setename("Mark");
	e1.setesalary(1500);
	e1.seteemail("mark@example.com");
	e1.setedept("chem");
	
System.out.println(e1.geteid());
System.out.println(e1.getename());
System.out.println(e1.getesalary());
System.out.println(e1.geteemail());
System.out.println(e1.getedept());
}
}
