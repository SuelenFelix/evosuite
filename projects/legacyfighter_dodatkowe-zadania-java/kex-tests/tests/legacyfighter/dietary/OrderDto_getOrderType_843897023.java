package legacyfighter.dietary;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static legacyfighter.dietary.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.String;

public class OrderDto_getOrderType_843897023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14776;

    public OrderDto_getOrderType_843897023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term14777 = new Long(6371581018571997173L);
        Class<? extends Object> term14818 = Class.forName((String) "legacyfighter.dietary.Order$OrderType");
        Field term14817 = ((Class) term14818).getDeclaredField((String) "Wire");
        ((Field) term14817).setAccessible(true);
        Object enum48 = ((Field) term14817).get((Object) null);
        Class<? extends Object> term15022 = Class.forName((String) "legacyfighter.dietary.Order$OrderState");
        Field term15021 = ((Class) term15022).getDeclaredField((String) "Returned");
        ((Field) term15021).setAccessible(true);
        Object enum49 = ((Field) term15021).get((Object) null);
        Long term14815 = new Long(6604328992663797314L);
        term14776 = newInstance(Class.forName("legacyfighter.dietary.OrderDto"));
        Object term14779 = newInstance(Class.forName("java.time.Instant"));
        Object term14802 = newInstance(Class.forName("legacyfighter.dietary.CustomerDto"));
        setField(term14776, term14776.getClass(), "orderId", term14777);
        setLongField(term14779, term14779.getClass(), "seconds", 1384837537L);
        setIntField(term14779, term14779.getClass(), "nanos", 981000000);
        setField(term14776, term14776.getClass(), "confirmationTimestamp", term14779);
        setField(term14776, term14776.getClass(), "orderType", enum48);
        setField(term14776, term14776.getClass(), "orderState", enum49);
        setField(term14802, term14802.getClass(), "name", "epPTwvcoyb");
        setField(term14802, term14802.getClass(), "id", term14815);
        setField(term14776, term14776.getClass(), "customerDto", term14802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrderType", argTypes, term14776, args);
    }

};


