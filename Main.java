
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails std =Student::new;
		Student st =std.getStudent("Riasad", 100, "A");
		System.out.println(st);
		//st.toString();
	}

}
