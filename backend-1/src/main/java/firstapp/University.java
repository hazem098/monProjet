package firstapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="universities")
public class University {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
@Column(name="Name")
private String Name;
@Column(name="Adress")
private String Adress;
@Column(name="Email")
private String Email;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return this.Name;
}
public void setName(String Name) {
	this.Name = Name;
}
public String getAdress() {
	return this.Adress;
}
public void setLastName(String Adress) {
	this.Adress = Adress;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public University(long id, String Name, String Adress, String email) {
	super();
	this.id = id;
	this.Name = Name;
	this.Adress = Adress;
	Email = email;
}
public University(){}
}
