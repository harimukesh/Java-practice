package practice;

public class Exception {
    public static void ExceptionMethod() throws RuntimeException {
        try{
            int a = 1 / 0;
            int[] b =new int[2*0];
            b[0]=1;
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
