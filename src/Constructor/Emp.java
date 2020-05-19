package Constructor;

public class Emp {

	int eid;
	String ename;
	float esal;

	Emp(int eid, String ename, float esal ) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		
	}

	void m1() {
		System.out.println("emp id=" + eid);
		System.out.println("emp ename=" + ename);
		System.out.println("emp esal=" + esal);
	}

	public static void main(String[] args) {

		Emp t = new Emp(10,"susss",1000);
		t.m1();
	}

}
