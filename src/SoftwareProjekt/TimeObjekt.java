package SoftwareProjekt;

public class TimeObjekt {
	private int tid;
	private Medarbejder m;

	public void updateTid(int tid) {
		this.tid = this.tid + tid;
	}

	public Medarbejder getMedarbejder() {
		return m;
	}
}
