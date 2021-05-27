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
		
	}
	
	public static List solution(int[] progresses, int[] speeds) {
		
		Queue<Integer> q = new ConcurrentLinkedQueue<Integer>();
		
		for(int i=0; i<progresses.length; i++) {
			q.add(
					
				(100 -progresses[i]%speeds[i] == 0 
				?(100 - progresses[i]) 
				:(100 - progresses[i])/speeds[i]+1)
				
				);			
		}
		// 
		
		List<Integer> result = new ArrayList<Integer>();
		int standard = q.poll();
		int cnt = 1;
		
		while(!q.isEmpty()) {
			int num = q.poll();
			
			
		}
		
		
		
		
		return result;
	}
	
	
	
	
}
