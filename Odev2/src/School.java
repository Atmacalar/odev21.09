
public class School {
	
	public School(String name, String surname, String phone) {
		
		this.name=name;
		this.surname=surname;
		this.phone=phone;
	}
	
	public School() {
		
		
	}
	
	private String name;
	private String surname;
	private String phone;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
