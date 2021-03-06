package hu.divide.android.quitesetter.data;

public class Period {
	String name;
	long start;
	long end;
	int mode;
	
	public Period(String name, long start, long end, int mode) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.mode = mode;
	}
	
	public String getName() {
		return name;
	}
	
	public long getStart() {
		return start;
	}
	
	public long getEnd() {
		return end;
	}
	
	public int getMode() {
		return mode;
	}

	public void setEnd(long end) {
		this.end = end;
	}
	
	public void setStart(long start) {
		this.start = start;
	}
	
	public void setMode(int mode) {
		this.mode = mode;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
