package queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution_1 {
	public static void main(String [] args) {
		
		
		
	}
	
	public static int [] solution(int [] processes,int [] speeds) {
		
		Queue<Integer> periodsQueue = new ConcurrentLinkedQueue<Integer>();
		
		for(int i=0; i<processes.length;i++) {
			int remainprocess = (100 - processes[i]);
			periodsQueue.add( remainprocess % speeds[i]==0 ? remainprocess/speeds[i] : remainprocess/speeds[i] +1);
			
		}
		
		List<Integer> countlist = new ArrayList<Integer>();				
		
		while(!periodsQueue.isEmpty()) {
			
			int cnt = 1;
			int q_poll = periodsQueue.poll(); 
			
			while(!periodsQueue.isEmpty() && q_poll >= periodsQueue.peek()) {
				
				q_poll = periodsQueue.poll();
				cnt++;
			}
			countlist.add(cnt);
		}
		
		int [] result = new int[countlist.size()] ;
		
		for(int i=0;i<countlist.size();i++) {
			result[i] = countlist.get(i);
		}
		return result;
	}
	
	
}
