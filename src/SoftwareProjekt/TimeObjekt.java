package SoftwareProjekt;

public class TimeObjekt {
	public TimeObjekt(Medarbejder m,int tid){
		this.m = m;
		this.tid = tid;
	}	
	private int tid;
	private Medarbejder m;

	public void updateTid(int tid) {
		this.tid = this.tid + tid;
	}

	public Medarbejder getMedarbejder() {
		return m;
	}
}
