package core_java_Collection;

public class Marksheet1 implements Comparable<Marksheet1> {
private String RollNo;
private String FirstName;
private String LastName;
private int Physics;
private int Chemistry;
private int Maths;
public Marksheet1() {

}
public String getRollNo() {
	return RollNo;
}
public void setRollNo(String rollNo) {
	RollNo = rollNo;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public int getPhysics() {
	return Physics;
}
public void setPhysics(int physics) {
	Physics = physics;
}
public int getChemistry() {
	return Chemistry;
}
public void setChemistry(int chemistry) {
	Chemistry = chemistry;
}
public int getMaths() {
	return Maths;
}
public void setMaths(int maths) {
	Maths = maths;
}

public int compareTo(Marksheet1 m) {
	
	return this.RollNo.compareTo(m.RollNo);
}

}
