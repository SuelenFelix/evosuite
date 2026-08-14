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

public class CustomerOrderGroup_getCustomer_20822400344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34876;

    public CustomerOrderGroup_getCustomer_20822400344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34877 = new Long(7397884986768994824L);
        HashMap term34880 = new HashMap();
        Set<Object> term35030 =  ((Map) term34880).keySet();
        HashSet term34879 = new HashSet((Collection<? extends Object>) term35030);
        Long term34903 = new Long(-5513509665682251667L);
        Class<? extends Object> term35052 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term35051 = ((Class) term35052).getDeclaredField((String) "Representative");
        ((Field) term35051).setAccessible(true);
        Object enum97 = ((Field) term35051).get((Object) null);
        Long term34937 = new Long(2739809214146796829L);
        HashMap term34940 = new HashMap();
        Set<Object> term35275 =  ((Map) term34940).keySet();
        HashSet term34939 = new HashSet((Collection<? extends Object>) term35275);
        Long term34959 = new Long(-6284173466459484010L);
        Class<? extends Object> term35297 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term35296 = ((Class) term35297).getDeclaredField((String) "Division");
        ((Field) term35296).setAccessible(true);
        Object enum98 = ((Field) term35296).get((Object) null);
        Long term34977 = new Long(-8600923187723020360L);
        HashMap term34980 = new HashMap();
        Set<Object> term35502 =  ((Map) term34980).keySet();
        HashSet term34979 = new HashSet((Collection<? extends Object>) term35502);
        Long term34998 = new Long(8852560867977898159L);
        Class<? extends Object> term35514 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term35513 = ((Class) term35514).getDeclaredField((String) "Representative");
        ((Field) term35513).setAccessible(true);
        Object enum99 = ((Field) term35513).get((Object) null);
        Long term35004 = new Long(4080207137910567677L);
        HashMap term35007 = new HashMap();
        Set<Object> term35737 =  ((Map) term35007).keySet();
        HashSet term35006 = new HashSet((Collection<? extends Object>) term35737);
        HashMap term35013 = new HashMap();
        Set<Object> term35738 =  ((Map) term35013).keySet();
        HashSet term35012 = new HashSet((Collection<? extends Object>) term35738);
        HashMap term35020 = new HashMap();
        Set<Object> term35739 =  ((Map) term35020).keySet();
        HashSet term35019 = new HashSet((Collection<? extends Object>) term35739);
        term34876 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34902 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34935 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34936 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34958 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34976 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34997 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term35003 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term34876, term34876.getClass(), "id", term34877);
        setField(term34876, term34876.getClass(), "orders", term34879);
        setField(term34876, term34876.getClass(), "description", "iFFcolxwcm");
        setField(term34902, term34902.getClass(), "id", term34903);
        setField(term34902, term34902.getClass(), "name", "bAsZBSqnyM");
        setField(term34902, term34902.getClass(), "type", enum97);
        setField(term34935, term34935.getClass(), "id", null);
        setField(term34935, term34935.getClass(), "orders", null);
        setField(term34935, term34935.getClass(), "description", null);
        setField(term34935, term34935.getClass(), "customer", null);
        setField(term34935, term34935.getClass(), "parent", null);
        setField(term34935, term34935.getClass(), "childs", null);
        setField(term34902, term34902.getClass(), "customerOrderGroup", term34935);
        setField(term34876, term34876.getClass(), "customer", term34902);
        setField(term34936, term34936.getClass(), "id", term34937);
        setField(term34936, term34936.getClass(), "orders", term34939);
        setField(term34936, term34936.getClass(), "description", "fbshyuUfqy");
        setField(term34958, term34958.getClass(), "id", term34959);
        setField(term34958, term34958.getClass(), "name", "eupNcihLEw");
        setField(term34958, term34958.getClass(), "type", enum98);
        setField(term34958, term34958.getClass(), "customerOrderGroup", term34936);
        setField(term34936, term34936.getClass(), "customer", term34958);
        setField(term34976, term34976.getClass(), "id", term34977);
        setField(term34976, term34976.getClass(), "orders", term34979);
        setField(term34976, term34976.getClass(), "description", "YcXTXuOFYV");
        setField(term34997, term34997.getClass(), "id", term34998);
        setField(term34997, term34997.getClass(), "name", "");
        setField(term34997, term34997.getClass(), "type", enum99);
        setField(term35003, term35003.getClass(), "id", term35004);
        setField(term35003, term35003.getClass(), "orders", null);
        setField(term35003, term35003.getClass(), "description", null);
        setField(term35003, term35003.getClass(), "customer", null);
        setField(term35003, term35003.getClass(), "parent", null);
        setField(term35003, term35003.getClass(), "childs", null);
        setField(term34997, term34997.getClass(), "customerOrderGroup", term35003);
        setField(term34976, term34976.getClass(), "customer", term34997);
        setField(term34976, term34976.getClass(), "parent", term34935);
        setField(term34976, term34976.getClass(), "childs", term35006);
        setField(term34936, term34936.getClass(), "parent", term34976);
        setField(term34936, term34936.getClass(), "childs", term35012);
        setField(term34876, term34876.getClass(), "parent", term34936);
        setField(term34876, term34876.getClass(), "childs", term35019);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomer", argTypes, term34876, args);
    }

};


