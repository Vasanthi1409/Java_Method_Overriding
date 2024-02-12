package Method_Overriding.com;

public class Override_Student_Details extends Student_Details {

	@Override
	public void student_Info(String name, int age, char G) {
		super.student_Info(name, age, G);
	}
	
	@Override
	public void student_Address(int doorno, String address, int pincode) {
		super.student_Address(doorno, address, pincode);
	}
	
	@Override
	public void student_Bankdetails(int fees, String Fname, char I, long accno) {
		super.student_Bankdetails(fees, Fname, I, accno);
	}	

	public static void main(String[] args) {

		Override_Student_Details MO = new Override_Student_Details();
		MO.student_Info("Hammy", 19, 'M');
		MO.student_Address(15, "VOC 1st cross street, Kovur, Chennai", 600112);
		MO.student_Bankdetails(25000, "John", 'H', 512345677231l);
	}

}
