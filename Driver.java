public class Driver {
    public static void main(String[] args)
    {
        SingletonDemo singletonDemo = SingletonDemo.getInstance();
        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();

        System.out.println("Address at: " + singletonDemo);
        System.out.println("Address at: " + singletonDemo1);

    }
}
