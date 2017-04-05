/**
 * Created by Vincent on 2017/4/5.
 */
public final class SingletonPattern {
    //Lazy initialization
    private static volatile SingletonPattern instance = null;
    private SingletonPattern() {}
    public static SingletonPattern getInstance() {
        if (instance == null) {
            //synchronized the class description object
            synchronized(SingletonPattern.class) {
                if (instance == null) {
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }
}
