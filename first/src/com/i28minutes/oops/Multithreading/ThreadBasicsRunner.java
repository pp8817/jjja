package com.i28minutes.oops.Multithreading;

//Thread를 생성하는 두 가지 방법
//1. extends Thread
//2. implements Runnable
//Thread를 사용하면 코드가 병렬로 실행됨. ex) Task1의 출력과 Task2의 출력이 한 번에 (뒤죽박죽으로)출력이 됨. 
class Task1 extends Thread{
	public void run() {
		System.out.print("\nTask1 Started");
		
		for(int i=101;i<=199; i++) {
			System.out.println(i+" ");
		}
		
		System.out.print("\nTask1 Done");	
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");
		
		for(int i=201;i<=299; i++) {
			System.out.println(i+" ");
		}
		
		System.out.print("\nTask2 Done");	
		
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		//위의 throws InterruptedException은 task.join() 부분 때문에 생긴것
		//Task1
//		for(int i=101;i<=199; i++) {
//			System.out.println(i+" ");
//		}
//		System.out.print("\nTask1 Done");
		Task1 task1 = new Task1();
//		task1.setPriority(1); //Thread의 우선순위 부여 but 명령이 아닌 '추천'을 할 뿐.
		task1.start();
		
		//Task2
//		for(int i=201;i<=299; i++) {
//			System.out.println(i+" ");
//		}
//		System.out.print("\nTask2 Done");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		//wait for task1 to complete
		task1.join(); //task1 실행이 끝난뒤 task3가 실행되도록 명령.
		task2Thread.join();
		
		//Task3
		for(int i=301;i<=399; i++) {
			System.out.println(i+" ");
		}
		System.out.print("\nTask3 Done");
		
		System.out.print("\nMain Done");
	}

}
