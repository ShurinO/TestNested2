public class MyTestClass {
    public void test(){
        /*v v = new v();
        MyInner myInner = new MyInner();
        method();*/
        System.out.print("MyTestClass.test() отработал");
    }

    public static class v{
        public v() {
            System.out.println("Nested class v instance created");
        }
        public void testInvoke(){
            MyTestClass myTestClass = new MyTestClass();
            myTestClass.test();
            System.out.println(" from Nested class v");
        }
    }
    public class MyInner{
        public MyInner() {
            System.out.println("MyInner instance created");
        }
        public void testInvoke(){
            test();
            System.out.println(" from inner class MyInner");
        }
    }
    public void method(){
        class MyLocal{
            public MyLocal() {
                System.out.println("MyLocal instance created");
            }
        }
        MyLocal myLocal = new MyLocal();
        MyTestClass.this.test();
        System.out.println(" from local inner class MyLocal");
    }
}
