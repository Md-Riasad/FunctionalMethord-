
public class Student {

	public String Name;
	public int Id;
	public String Section ;
	public Student(String name, int id, String section) {
		super();
		Name = name;
		Id = id;
		Section = section;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Id=" + Id + ", Section=" + Section + "]";
	}
	
	
	
	
	
}
