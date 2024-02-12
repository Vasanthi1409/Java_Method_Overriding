package Method_Overriding.com;

public class Student_Details {

	public void student_Info(String name, int age, char G) {
		System.out.println("Student Name: " + name);
		System.out.println("Student Age: " + age);
		System.out.println("Student Gender: " + G);
	}

	public void student_Address(int doorno, String address, int pincode) {
		System.out.println("Student address along with pincode: " + doorno + ", " + address + "-" + pincode);
	}

	public void student_Bankdetails(int fees, String Fname, char I, long accno) {
		System.out.println("Student Fees: " + fees);
		System.out.println("Student Father Name and his Initial: " + Fname + "." + I);
		System.out.println("Student Bank Account Number: " + accno);
	}

	public static void main(String[] args) {
		Student_Details obj = new Student_Details();
		obj.student_Info("Harish", 20, 'M');
		obj.student_Address(13, "Ambal Nagar, Kovur, Chennai", 600128);
		obj.student_Bankdetails(50000, "Mugilan", 'S', 512345678342l);
	}
}
