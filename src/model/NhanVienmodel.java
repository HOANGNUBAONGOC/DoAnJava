package model;

public class NhanVienmodel {
	private String id;
	private String nameNV;
	private String sex;
	private String position;
	private String birthday;
	private String address;
	private String phonenumber;
	private String email;
	private int salary;
	
	public NhanVienmodel() {
		// TODO Auto-generated constructor stub
	}

	public NhanVienmodel(String id, String nameNV, String sex, String position, String birthday, String address,
			String phonenumber, String email, int salary) {
		super();
		this.id = id;
		this.nameNV = nameNV;
		this.sex = sex;
		this.position = position;
		this.birthday = birthday;
		this.address = address;
		this.phonenumber = phonenumber;
		this.email = email;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNameNV() {
		return nameNV;
	}

	public void setNameNV(String nameNV) {
		this.nameNV = nameNV;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "NhanVien [id=" + id + ", nameNV=" + nameNV + ", sex=" + sex + ", position=" + position + ", birthday="
				+ birthday + ", address=" + address + ", phonenumber=" + phonenumber + ", email=" + email + ", salary="
				+ salary + ", getId()=" + getId() + ", getNameNV()=" + getNameNV() + ", getSex()=" + getSex()
				+ ", getPosition()=" + getPosition() + ", getBirthday()=" + getBirthday() + ", getAddress()="
				+ getAddress() + ", getPhonenumber()=" + getPhonenumber() + ", getEmail()=" + getEmail()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
	
}

