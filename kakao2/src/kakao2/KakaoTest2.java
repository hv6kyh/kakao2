package kakao2;

import java.util.ArrayList;
import java.util.Collections;

public class KakaoTest2 {
	
	private static int N = 5;
	private static ArrayList<Stage> stageFail = new ArrayList<>();
	
	private static int[] stages = {
			2, 1, 2, 6, 2, 4, 3, 3
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float failure;			// 실패율
		int nCnt, nOverCnt;		// n의 개수, n이상인 수의 개수
		
		for (int n = 1; n <= N; n++) {
			
			// 초기화
			nCnt = 0;
			nOverCnt = 0;
			
			for (int i = 0; i < stages.length; i++) {
				
				if (stages[i] >= n) {
					nOverCnt++;
					
					if (stages[i] == n)
						nCnt++;
					
				}
				
			}
	
			failure = (float)nCnt / nOverCnt;
			stageFail.add(new Stage(n, failure));
			// (스테이지번호, 실패율) 기록
	
		}
		
		// 실패율을 기준으로 정렬
		Collections.sort(stageFail);
		
		System.out.println(stageFail);

	}

}
