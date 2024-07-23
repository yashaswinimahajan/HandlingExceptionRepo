package in.handlingexception;

public class RethrowExceptionExample {
    public static void method1() throws Exception {
        throw new Exception("Original Exception in method1");
    }

    public static void method2() throws Exception {
        try {
            method1();
        } catch (Exception e) {
            throw new Exception("Exception in method2", e);
        }
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (Exception e) {
        	e.printStackTrace();	
        }
    }
}
