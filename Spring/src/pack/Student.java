package pack;

public class Student {
	private String sname;
	private int sid;
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void display(){  
	    System.out.println("Hello: "+sname);  
	}
}
