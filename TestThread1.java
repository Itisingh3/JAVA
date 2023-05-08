class TestThread1 extends Thread{
    public static void main(String... arr){
        TestThread1 t1=new TestThread1();
        TestThread1 t2=new TestThread1();
        
        t1.start();
        t2.start();
        
    }
    public void run(){
        if(Thread.currentThread().getName().equals("Thread-0")){      
            for(int i=1;i<=10;i++){
                if(i%2==0)
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
        else {
            for(int i=0;i<10;i++){
                if(i%2!=0)
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
    }

}
