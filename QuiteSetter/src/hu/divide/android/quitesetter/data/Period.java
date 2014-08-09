package hu.divide.android.quitesetter.data;

public class Period {
	String name;
	long start;
	long end;
	int mode;
	
	public Period(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
