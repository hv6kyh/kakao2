package kakao2;

// Collentions.sort() 메소드 사용을 위해 Comparable 인터페이스 사용
public class Stage implements Comparable<Stage>{
	
	private int stageNumber;
	private float failureRate;

	@Override
	public String toString() {
//		return "Stage [stageNumber=" + stageNumber + ", failureRate=" + failureRate + "]";
		return stageNumber + "";
	}
	public int getStageNumber() {
		return stageNumber;
	}
	public void setStageNumber(int stageNumber) {
		this.stageNumber = stageNumber;
	}
	public float getFailureRate() {
		return failureRate;
	}
	public void setFailureRate(float failureRate) {
		this.failureRate = failureRate;
	}
	
	public Stage(int stageNumber, float failureRate) {
		super();
		this.stageNumber = stageNumber;
		this.failureRate = failureRate;
	}
	
	@Override
	public int compareTo(Stage stg) {
		// TODO Auto-generated method stub
		
		if (this.failureRate > stg.failureRate) {
			return -1;
		}
		else if (this.failureRate < stg.failureRate) {
			return 1;
		}
		return 0;
		
	}
	
	
}
