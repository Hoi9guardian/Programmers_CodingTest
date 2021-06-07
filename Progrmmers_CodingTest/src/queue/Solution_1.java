package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution_1 {
	public static void main(String [] args) {
		int [] processes = {93,30,55};
		int [] speeds = {1,30,5};
		prn(solution(processes,speeds));
		
	}
	
	public static int [] solution(int [] processes,int [] speeds) {
		
		Queue<Integer> periodsQueue = new ConcurrentLinkedQueue<Integer>();
		
		for(int i=0; i<processes.length;i++) {
			int remainprocess = (100 - processes[i]);
			periodsQueue.add( remainprocess % speeds[i]==0 ? remainprocess/speeds[i] : remainprocess/speeds[i] +1);
			
		}
		
		List<Integer> countlist = new ArrayList<Integer>();
		
		int q_std = periodsQueue.poll();
		int cnt = 1;
		
		while(!periodsQueue.isEmpty()) {
					 
			int q_next = periodsQueue.poll();
								
			if(q_std >= q_next) {
				cnt++;
			}else {
				countlist.add(cnt);
				cnt=1;
				q_std = q_next;
			}
			
			/*
			 * 		
			 * 
			 * 
			 * 
			 * 
			 */			
			
		}
		
		countlist.add(cnt);
				
		
		int [] result = new int[countlist.size()] ;
		
		for(int i=0;i<countlist.size();i++) {
			result[i] = countlist.get(i);
		}
		return result;
	}
	
	public static void prn(int [] result) {
		
		for(int i =0 ; i< result.length; i++) {
			System.out.print(result[i]);
		}
	}
	
	
}
