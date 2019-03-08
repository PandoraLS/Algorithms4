package HelloWorld;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("hello, world");
        System.out.println("提交git");
        System.out.println("最后一次提交git，事实证明，直接提交整个项目就可以了，.idea下面的所有文件");
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.dir")+"\\src\\main\\webapp\\js\\knowledgeGrowing.json\\"+"lalal.txt");
//        System.out.println(System.out.println(directory.getAbsolutePath());
    }
}


/**
 * D:\code\Algorithms\Algorithms4\src>javac HelloWorld\HelloWorld.java
 * D:\code\Algorithms\Algorithms4\src>java HelloWorld.HelloWorld
 * 必须这么来运行，如果进入到HelloWorld的package中，就会遇到错误：找不到或无法加载主类。
 */
