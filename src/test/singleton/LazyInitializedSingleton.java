package test.singleton;

/**
 * Lazy initialization method to implement Singleton pattern creates the instance in the global access method. Here is
 * the sample code for creating Singleton class with this approach.
 * 
 * The implementation below works fine in case of single threaded environment but when it comes to multi-threaded systems,
 * it can cause issues if multiple threads are inside the if loop at the same time. It will destroy the singleton
 * pattern and both threads will get the different instances of singleton class.
 *
 */
public class LazyInitializedSingleton
{
    private static LazyInitializedSingleton instance;

    public LazyInitializedSingleton()
    {
    }

    public static LazyInitializedSingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
