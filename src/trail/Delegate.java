package trail;

public class Delegate {
	
	String name;
	String surname;
	String id;
	public Delegate(String name, String surname, String id) {
		super();
		this.name = name;
		this.surname = surname;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getId() {
		return id;
	}
	
	public String to(){
		return "surname" + "name" + "id";
	}

}
