public class Demo {
    @Override
    protected void finalize() throws Throwable {
        //当调用gc时，由 gc 建议调用此方法
        System.out.println("finalize...");
    }

    public static void main(String[] args) {
        // 产生垃圾
        for(int i=0;i<3;i++){
            Demo d = new Demo();
        }
        //建议 销毁对象
        System.gc(); //gc -> finalize()
    }
}
