package CollectionFW;

public class Student implements Comparable<Student> {
	private String stname;
	private Integer stid;
	
	public Integer getStid() {
		return stid;
	}
	
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	
	public String getStname() {
		return stname;
	}
	
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	public Student(Integer stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	
	@Override
	public String toString() {
		return stid + " " + stname;
	}

	@Override
	public int compareTo(Student o) {
		return this.getStid().compareTo(o.getStid());
		
		//return o.getStname().compareTo(this.getStname());
	}
	
}
