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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class OrderService_fetchChildOrders_18378791584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term876;
     Object term943;

    public OrderService_fetchChildOrders_18378791584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term877 = new Long(-5892135042702373494L);
        HashMap term880 = new HashMap();
        Set<Object> term956 =  ((Map) term880).keySet();
        HashSet term879 = new HashSet((Collection<? extends Object>) term956);
        Long term903 = new Long(-5788180182343976541L);
        Class<? extends Object> term1038 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term1037 = ((Class) term1038).getDeclaredField((String) "Company");
        ((Field) term1037).setAccessible(true);
        Object enum0 = ((Field) term1037).get((Object) null);
        HashMap term931 = new HashMap();
        Set<Object> term1240 =  ((Map) term931).keySet();
        HashSet term930 = new HashSet((Collection<? extends Object>) term1240);
        term876 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term902 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term928 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term929 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term876, term876.getClass(), "id", term877);
        setField(term876, term876.getClass(), "orders", term879);
        setField(term876, term876.getClass(), "description", "onpbIeEKoi");
        setField(term902, term902.getClass(), "id", term903);
        setField(term902, term902.getClass(), "name", "YRHGsAkhxb");
        setField(term902, term902.getClass(), "type", enum0);
        setField(term928, term928.getClass(), "id", null);
        setField(term928, term928.getClass(), "orders", null);
        setField(term928, term928.getClass(), "description", null);
        setField(term928, term928.getClass(), "customer", null);
        setField(term928, term928.getClass(), "parent", null);
        setField(term928, term928.getClass(), "childs", null);
        setField(term902, term902.getClass(), "customerOrderGroup", term928);
        setField(term876, term876.getClass(), "customer", term902);
        setField(term929, term929.getClass(), "id", null);
        setField(term929, term929.getClass(), "orders", null);
        setField(term929, term929.getClass(), "description", null);
        setField(term929, term929.getClass(), "customer", null);
        setField(term929, term929.getClass(), "parent", null);
        setField(term929, term929.getClass(), "childs", null);
        setField(term876, term876.getClass(), "parent", term929);
        setField(term876, term876.getClass(), "childs", term930);
        HashMap term944 = new HashMap();
        Set<Object> term1241 =  ((Map) term944).keySet();
        term943 = new HashSet((Collection<? extends Object>) term1241);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.OrderService");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = term876;
        args[1] = term943;
        callMethod(klass, "fetchChildOrders", argTypes, null, args);
    }

};


