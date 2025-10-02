package creational_design_pattern.singleton;

public class ClientCode {

    public static void main(String[] args) {

        EagerInitialization.getInstance().displayConfiguration();

        //In a multi-threaded environment, there is a possibility that multiple instances of singleton class get created.
        // Consider a scenario where two threads (say, t1 and t2) call getInstance() at the same time.
        // Let’s suppose t1 is preempted just after it enters if block and control of execution is given to t2.
        // Thus, both threads will get a new instance of the singleton class.
        LazyInitializationExample.getInstance().display();

        //to Solve the above problem we can use synchronized keyword in method. However, it comes with a problem as well which is
        // The problem with the synchronized keyword at the getInstance() method level is that it is expensive.
        // Each access to the getInstance() method will acquire a lock by the thread on the SingletonInMutliThreadedEnv object.
        // This approach brings low performance to the system.
        // Ideally, the lock on the object should be acquired for the first time the getInstance() method is called,
        // but in reality, the code is locking the object every time the getInstance() method is called.
        SingletonInMutliThreadedEnv.getInstance().display();
        // To solve this problem, instead of synchronizing at the method level, we synchronize at the block (critical section) level.
        //it makes code thread-safe
        //However, the above code is still not thread-safe.
        //Consider a scenario – Let’s say thread t1 enters the synchronized block
        //  before it can assign a new ConfigurationManager instance to the static instance variable, the thread t1 is preempted.
        // Meanwhile, thread t2 enters the if block, as the static instance variable is still null.
        // Now thread t2 will wait for thread t1 to finish executing synchronized block.
        // Once thread t1 comes out of the synchronized block it releases its lock. Now thread t2 enters
        // the synchronized block by acquiring the lock and starts executing it. As a result, both threads t1 and t2
        // at the end will wind up having different instances of ConfigurationManager
        SingletonWithSynchronizedBlock.getInstance().display();
       // Double-checked lockingThis strategy provides thread-safe lazy initialization of the singleton class.
        // The idea behind this strategy is that we provide a null check on the static instance variable again inside the synchronized block.
        SingletonWithDoubleCheckedLocking.getInstance().display();
    }
}
