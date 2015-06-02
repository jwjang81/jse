package api02.util.hashMap;

public class MemberVO2 {
	private String name;     // 회원 이름
	private String addr;     // 회원 주소
	private int age;         // 회원 나이
	private String id;       // 회원 ID
	private String password; // 회원 비번
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "MemberVO2 [name=" + name + ", addr=" + addr + ", age=" + age
				+ ", id=" + id + ", password=" + password + "]";
	}
	
	
}
