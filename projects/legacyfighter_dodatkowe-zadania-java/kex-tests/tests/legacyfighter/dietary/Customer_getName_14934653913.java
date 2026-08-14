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

public class Customer_getName_14934653913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39947;

    public Customer_getName_14934653913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39948 = new Long(3093905091334313614L);
        Class<? extends Object> term40032 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term40031 = ((Class) term40032).getDeclaredField((String) "Person");
        ((Field) term40031).setAccessible(true);
        Object enum114 = ((Field) term40031).get((Object) null);
        Long term39973 = new Long(6031696788173482309L);
        HashMap term39976 = new HashMap();
        Set<Object> term40231 =  ((Map) term39976).keySet();
        HashSet term39975 = new HashSet((Collection<? extends Object>) term40231);
        Long term39995 = new Long(365411533450462757L);
        Class<? extends Object> term40253 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term40252 = ((Class) term40253).getDeclaredField((String) "Admin");
        ((Field) term40252).setAccessible(true);
        Object enum115 = ((Field) term40252).get((Object) null);
        HashMap term40015 = new HashMap();
        Set<Object> term40449 =  ((Map) term40015).keySet();
        HashSet term40014 = new HashSet((Collection<? extends Object>) term40449);
        term39947 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term39972 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term39994 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term40012 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40013 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term39947, term39947.getClass(), "id", term39948);
        setField(term39947, term39947.getClass(), "name", "FuCKfgAhpC");
        setField(term39947, term39947.getClass(), "type", enum114);
        setField(term39972, term39972.getClass(), "id", term39973);
        setField(term39972, term39972.getClass(), "orders", term39975);
        setField(term39972, term39972.getClass(), "description", "jPPOVoAOLQ");
        setField(term39994, term39994.getClass(), "id", term39995);
        setField(term39994, term39994.getClass(), "name", "kZKzEkUFFI");
        setField(term39994, term39994.getClass(), "type", enum115);
        setField(term40012, term40012.getClass(), "id", null);
        setField(term40012, term40012.getClass(), "orders", null);
        setField(term40012, term40012.getClass(), "description", null);
        setField(term40012, term40012.getClass(), "customer", null);
        setField(term40012, term40012.getClass(), "parent", null);
        setField(term40012, term40012.getClass(), "childs", null);
        setField(term39994, term39994.getClass(), "customerOrderGroup", term40012);
        setField(term39972, term39972.getClass(), "customer", term39994);
        setField(term40013, term40013.getClass(), "id", null);
        setField(term40013, term40013.getClass(), "orders", null);
        setField(term40013, term40013.getClass(), "description", null);
        setField(term40013, term40013.getClass(), "customer", null);
        setField(term40013, term40013.getClass(), "parent", null);
        setField(term40013, term40013.getClass(), "childs", null);
        setField(term39972, term39972.getClass(), "parent", term40013);
        setField(term39972, term39972.getClass(), "childs", term40014);
        setField(term39947, term39947.getClass(), "customerOrderGroup", term39972);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term39947, args);
    }

};


