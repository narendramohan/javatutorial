import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	static int MAX_SIZE=5;
	static BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(MAX_SIZE);
	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		producer.start();
		consumer.start();

	}
	static class Producer extends Thread {
		Random random = new Random();
		public void run() {
			while (true) {
				try {
					int element = random.nextInt();
					System.out.println("Pushing new element :"+element);
					queue.put(element);
				}  catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class Consumer extends Thread {
		
		public void run() {
			while (true) {
				try {
					
					System.out.println("getting elements :"+queue.take());
					
				}  catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}

