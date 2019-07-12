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
		
		float failure;			// ������
		int nCnt, nOverCnt;		// n�� ����, n�̻��� ���� ����
		
		for (int n = 1; n <= N; n++) {
			
			// �ʱ�ȭ
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
			// (����������ȣ, ������) ���
	
		}
		
		// �������� �������� ����
		Collections.sort(stageFail);
		
		System.out.println(stageFail);

	}

}
