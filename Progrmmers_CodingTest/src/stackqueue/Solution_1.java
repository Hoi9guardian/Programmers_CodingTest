package stackqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution_1 {
	public static void main(String [] args ) {
/*		 : progresses  : speeds
 * 		
 * 
 * 깃허브 테스트 중 ....  6_ gitignore _ 깃허브 반영 여부 확인 
 * 
 * 
 * */
		int[] progresses = {93,30,55};
		int[] speeds = {1,30,5};
		
		prn(solution(progresses,speeds));
		
		
	}
	
	public static List solution(int[] progresses, int[] speeds) {
		
		Queue<Integer> pQ = new ConcurrentLinkedQueue<Integer>();
		// 
		for(int i=0; i<progresses.length; i++) {
			pQ.add(
				// 삼항연산자	
				(100 - progresses[i] % speeds[i] == 0 
				?	(100 - progresses[i])/speeds[i] 
				:	(100 - progresses[i])/speeds[i]+1)
				
			);			
		}
		
		// 
		
		List<Integer> result = new ArrayList<Integer>();
		
		
		
		while(!pQ.isEmpty()) {
			int period = pQ.poll();
			int cnt = 1;
			
			while(!pQ.isEmpty() && period >= pQ.peek()) {
				cnt++;
				pQ.poll();
			}
			result.add(cnt);
					
		}
		
		
		
		
		return result;
	}
	
	
	public static void prn(List<Integer> result) {
			System.out.print("[ ");
		for(int i=0; i<result.size() ;i++) {
			
			System.out.print(result.get(i)+", ");
			
			if(i==result.size()-1) {
				System.out.print(result.get(i)+" ]");
			}
			
		}
		
		
	}
	
}
