
/*
 * In the below solution, producer and consumer - PRODUCE and CONSUME on different times
 * But, the consumer consumers same data multiple times 
 */
// * SHARED DATA Class
class MyData {
  int value = 0;
  boolean flag = true;

  synchronized void setValue(int x){
    while(flag != true)
      try {wait();} catch(Exception e){} // * Thread can be Interrupted, hence InterruptedException can arise
    this.value = x;
    flag = false;
    notify();
  }
  
  
  synchronized int getValue(){
    int x = 0;
    
    while(flag != false)
    try {wait();} catch(Exception e){} // * Thread can be Interrupted, hence InterruptedException can arise
    
    x = this.value;
    flag = true;
    notify();
    return x;
  }
}

class Producer extends Thread{
  MyData data;

  Producer(MyData data){
    this.data = data;
  }

  public void run() {
    int i = 1;
    while(true){
      data.setValue(i);
      System.out.println("Producer Produced : " + data.value);
      i++;
    }
  }
}

class Consumer extends Thread{
  MyData data;

  Consumer(MyData data){
    this.data = data;
  }

  public void run() {
    while(true){
      System.out.println("Consumer Consumed: " + data.getValue());
    }
  }
}

public class producerConsumerSync {
  public static void main(String[] args) {
    MyData data = new MyData();
    Producer producer = new Producer(data);
    Consumer consumer = new Consumer(data);

    producer.start();
    consumer.start();
  }
}
