public class Main {
    public static void main(String[] args) {
        MyTestClass myTestClass = new MyTestClass();

        MyTestClass.MyInner myInner = myTestClass.new MyInner();
        myInner.testInvoke();

        MyTestClass.v v = new MyTestClass.v();
        v.testInvoke();

        myTestClass.method();

        
    }
}
