package trail;

public class Runner {


	String name;
	String surname;
	private Integer num;
	
    public Runner(String name, String surname, Integer num) {
	
		this.name = name;
		this.surname = surname;
		this.num = num;
	}

	public int getBibNumber(){
        return num;
    }

    public String getName(){
        return "name";
    }

    public String getSurname(){
        return "surname";
    }

}
