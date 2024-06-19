
/*
 * In the below solution, producer and consumer - PRODUCE and CONSUME on different times
 * But, the consumer consumers same data multiple times 
 */
// * SHARED DATA Class
class MyData {
  int value = 0;
  
  synchronized void setValue(int x){
    this.value = x;
  }

  synchronized int getValue(){
    int x = this.value;
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


public class producerConsumerMultiple {
  public static void main (String args[]){
    MyData data = new MyData();
    Producer producer = new Producer(data);
    Consumer consumer = new Consumer(data);

    producer.start();
    consumer.start();
  }
}