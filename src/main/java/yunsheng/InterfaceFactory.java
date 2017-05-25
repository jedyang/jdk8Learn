package yunsheng;

import java.util.function.Supplier;

/**
 * Created by shengyun on 17/3/11.
 */
public interface InterfaceFactory {

    static FInterface create(Supplier<FInterface> supplier){
       return supplier.get();
    }
}
