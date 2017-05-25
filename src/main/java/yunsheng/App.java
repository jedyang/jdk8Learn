package yunsheng;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // 函数当作方法的参数
        Arrays.asList("a", "b", "c").forEach(e -> show(e));

        // 方法引用
        FInterface fi = InterfaceFactory.create(FInterfaceImpl::new);

        System.out.println(fi.method2());
        System.out.println(fi.method3());

    }

    public static void show(String e) {
        System.out.println(e);
    }
}
