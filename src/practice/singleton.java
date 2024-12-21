package practice;

//bill pugh method singleton - thread safe
public class singleton {
    private singleton() {}
    public String str="hello from singleton";
    public class singletonhelper{
        private static final singleton  instance = new singleton();
    }
    public static singleton getinstance() {
        return singletonhelper.instance;
    }
}
