package com.i28minutes.oops.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{

	private int number;

	public Task(int number) {
		this.number = number;
	}
	
	public void run() {
		System.out.print("\nTask1 " + number + "Started");
		
		for(int i=number*100;i<=number*100+99 ; i++) {
			System.out.println(i+" ");
		}
		
		System.out.print("\nTask " + number +  "Done");	
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
//		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//newSingleThreadExecutor: 한 번에 하나의 스레드만 처리함. ex)task1 완료되고 task2 실행(병렬x)
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		//newFixedThreadPool: 동시에 실행되는 스레드의 수를 지정
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
//		executorService.execute(new Thread(new Task2()));
		

//		//Task3
//		for(int i=301;i<=399; i++) {
//			System.out.println(i+" ");
//		}
//		System.out.print("\nTask3 Done");
//		
//		System.out.print("\nMain Done");
				
		executorService.shutdown();

	}

}
