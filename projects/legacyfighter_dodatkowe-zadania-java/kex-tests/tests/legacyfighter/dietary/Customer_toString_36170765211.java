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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Customer_toString_36170765211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44397;

    public Customer_toString_36170765211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44398 = new Long(-3057089152637139157L);
        Class<? extends Object> term44505 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term44504 = ((Class) term44505).getDeclaredField((String) "Admin");
        ((Field) term44504).setAccessible(true);
        Object enum130 = ((Field) term44504).get((Object) null);
        Long term44422 = new Long(3094322609315685109L);
        HashMap term44425 = new HashMap();
        Set<Object> term44701 =  ((Map) term44425).keySet();
        HashSet term44424 = new HashSet((Collection<? extends Object>) term44701);
        Long term44444 = new Long(-1132124748716009489L);
        Long term44460 = new Long(-7014938412778189699L);
        HashMap term44463 = new HashMap();
        Set<Object> term44722 =  ((Map) term44463).keySet();
        HashSet term44462 = new HashSet((Collection<? extends Object>) term44722);
        HashMap term44482 = new HashMap();
        Set<Object> term44733 =  ((Map) term44482).keySet();
        HashSet term44481 = new HashSet((Collection<? extends Object>) term44733);
        HashMap term44488 = new HashMap();
        Set<Object> term44734 =  ((Map) term44488).keySet();
        HashSet term44487 = new HashSet((Collection<? extends Object>) term44734);
        term44397 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term44421 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term44443 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term44458 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term44459 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term44480 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        setField(term44397, term44397.getClass(), "id", term44398);
        setField(term44397, term44397.getClass(), "name", "oNGVAyjCob");
        setField(term44397, term44397.getClass(), "type", enum130);
        setField(term44421, term44421.getClass(), "id", term44422);
        setField(term44421, term44421.getClass(), "orders", term44424);
        setField(term44421, term44421.getClass(), "description", "cHjhnXKTVF");
        setField(term44443, term44443.getClass(), "id", term44444);
        setField(term44443, term44443.getClass(), "name", "NVsXpTZPoM");
        setField(term44443, term44443.getClass(), "type", enum130);
        setField(term44458, term44458.getClass(), "id", null);
        setField(term44458, term44458.getClass(), "orders", null);
        setField(term44458, term44458.getClass(), "description", null);
        setField(term44458, term44458.getClass(), "customer", null);
        setField(term44458, term44458.getClass(), "parent", null);
        setField(term44458, term44458.getClass(), "childs", null);
        setField(term44443, term44443.getClass(), "customerOrderGroup", term44458);
        setField(term44421, term44421.getClass(), "customer", term44443);
        setField(term44459, term44459.getClass(), "id", term44460);
        setField(term44459, term44459.getClass(), "orders", term44462);
        setField(term44459, term44459.getClass(), "description", "adNbqunmox");
        setField(term44480, term44480.getClass(), "id", null);
        setField(term44480, term44480.getClass(), "name", null);
        setField(term44480, term44480.getClass(), "type", null);
        setField(term44480, term44480.getClass(), "customerOrderGroup", null);
        setField(term44459, term44459.getClass(), "customer", term44480);
        setField(term44459, term44459.getClass(), "parent", term44458);
        setField(term44459, term44459.getClass(), "childs", term44481);
        setField(term44421, term44421.getClass(), "parent", term44459);
        setField(term44421, term44421.getClass(), "childs", term44487);
        setField(term44397, term44397.getClass(), "customerOrderGroup", term44421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term44397, args);
    }

};


