package Java.lang;
public class String {
    /* JDK、三方 jar 包含了非常多的 class 文件
       如果自己编写的 某个类，碰巧与 某个jar文件中的 class 重名了
       问 是否会发生覆盖。
       例如，jdk 中自带了 java.lang.String
       如果自己也写一个 java.lang.String
       自己写的 String 能否覆盖 JDK 中的String，或者产生冲突之类的影响？
    */
    public static void main(String[] args) {
        System.out.println("hello world");
    }
    // 在部分开发工具下，本代码运行时报错：找到不main()方法
    // JVM 内部存在双亲委派模式，作用：防止自己写的某个类名与JAR中的重名

    // 本文件中的 String 根本不会被 ClassLoader 加载


}
