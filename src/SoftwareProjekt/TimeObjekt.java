// Udarbejdet af Krstian Krarup

package SoftwareProjekt;

public class TimeObjekt {
	@SuppressWarnings("unused")
	private TimeObjekt TimeObjekt;

	public TimeObjekt(Medarbejder m,int tid){
		this.m = m;
		this.tid = tid;
	}	
	public TimeObjekt(TimeObjekt timeObjekt) {
		this.TimeObjekt = new TimeObjekt(timeObjekt);
	}
	public int tid;
	public Medarbejder m;

	public void updateTid(int tid) {
		this.tid = this.tid + tid;
	}

	public Medarbejder getMedarbejder() {
		return m;
	}
	
	public int getTid(){
		return tid;
	}
	
	public String toString() {
		return (this.m.getNavn()+
				this.m.getIntialer() +
				this.m.getTlf() +
				this.m.getEmail()+
				this.getTid());
	}
}
