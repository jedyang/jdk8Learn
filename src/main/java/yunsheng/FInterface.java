package yunsheng;

/**
 * 函数接口是一种只有一个方法的接口，像这样地，函数接口可以隐式地转换成lambda表达式。
 * Created by shengyun on 17/3/10.
 */
@FunctionalInterface
public interface FInterface {
    void method1();

    // deafault关键字，默认方法
    default String method2(){
        return "interface m2";
    }
    // 默认方法可以搞多个
    default String method3(){
        return "interface m3";
    }
}
