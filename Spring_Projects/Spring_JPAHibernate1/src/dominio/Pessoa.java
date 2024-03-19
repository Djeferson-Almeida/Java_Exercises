package dominio;

import java.io.Serializable;

public class Pessoa implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String Name;
	private String email;
	
	public Pessoa() {
	}

	public Pessoa(Integer id, String name, String email) {
		this.id = id;
		Name = name;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Pessoa id=" + id + ", Name=" + Name + ", email=" + email ;
	}
	
	
	
}
