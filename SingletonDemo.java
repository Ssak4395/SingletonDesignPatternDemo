public class SingletonDemo {

    private static SingletonDemo singletonclass;
    // Eager instantiation
     private static SingletonDemo singletonclassEager = new SingletonDemo();


    private SingletonDemo()
    {}

    public static  synchronized  SingletonDemo getInstance()
/*
   This is an example of a lazy instantiation of our instance class, note
   how our object is instantiated if and only if getInstance is called.
*/

    {


        if(singletonclass == null)
        {
            singletonclass = new SingletonDemo();
        }
        return singletonclass;
    }
}
