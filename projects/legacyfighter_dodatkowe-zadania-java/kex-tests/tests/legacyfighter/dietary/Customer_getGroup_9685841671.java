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

public class Customer_getGroup_9685841671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39267;

    public Customer_getGroup_9685841671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39268 = new Long(1551212309300619628L);
        Class<? extends Object> term39385 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term39384 = ((Class) term39385).getDeclaredField((String) "Representative");
        ((Field) term39384).setAccessible(true);
        Object enum112 = ((Field) term39384).get((Object) null);
        Long term39301 = new Long(-4520530213003895999L);
        HashMap term39304 = new HashMap();
        Set<Object> term39608 =  ((Map) term39304).keySet();
        HashSet term39303 = new HashSet((Collection<? extends Object>) term39608);
        Long term39323 = new Long(-3955508582186061944L);
        Long term39339 = new Long(-5215160586515108435L);
        HashMap term39342 = new HashMap();
        Set<Object> term39629 =  ((Map) term39342).keySet();
        HashSet term39341 = new HashSet((Collection<? extends Object>) term39629);
        HashMap term39362 = new HashMap();
        Set<Object> term39640 =  ((Map) term39362).keySet();
        HashSet term39361 = new HashSet((Collection<? extends Object>) term39640);
        HashMap term39368 = new HashMap();
        Set<Object> term39641 =  ((Map) term39368).keySet();
        HashSet term39367 = new HashSet((Collection<? extends Object>) term39641);
        term39267 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term39300 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term39322 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term39337 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term39338 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term39359 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term39360 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term39267, term39267.getClass(), "id", term39268);
        setField(term39267, term39267.getClass(), "name", "JNzgWUmqtl");
        setField(term39267, term39267.getClass(), "type", enum112);
        setField(term39300, term39300.getClass(), "id", term39301);
        setField(term39300, term39300.getClass(), "orders", term39303);
        setField(term39300, term39300.getClass(), "description", "gNeMyGSVIG");
        setField(term39322, term39322.getClass(), "id", term39323);
        setField(term39322, term39322.getClass(), "name", "qxEkaqdKPG");
        setField(term39322, term39322.getClass(), "type", enum112);
        setField(term39337, term39337.getClass(), "id", null);
        setField(term39337, term39337.getClass(), "orders", null);
        setField(term39337, term39337.getClass(), "description", null);
        setField(term39337, term39337.getClass(), "customer", null);
        setField(term39337, term39337.getClass(), "parent", null);
        setField(term39337, term39337.getClass(), "childs", null);
        setField(term39322, term39322.getClass(), "customerOrderGroup", term39337);
        setField(term39300, term39300.getClass(), "customer", term39322);
        setField(term39338, term39338.getClass(), "id", term39339);
        setField(term39338, term39338.getClass(), "orders", term39341);
        setField(term39338, term39338.getClass(), "description", "kNkFIdfwqs");
        setField(term39359, term39359.getClass(), "id", null);
        setField(term39359, term39359.getClass(), "name", null);
        setField(term39359, term39359.getClass(), "type", null);
        setField(term39359, term39359.getClass(), "customerOrderGroup", null);
        setField(term39338, term39338.getClass(), "customer", term39359);
        setField(term39360, term39360.getClass(), "id", null);
        setField(term39360, term39360.getClass(), "orders", null);
        setField(term39360, term39360.getClass(), "description", null);
        setField(term39360, term39360.getClass(), "customer", null);
        setField(term39360, term39360.getClass(), "parent", null);
        setField(term39360, term39360.getClass(), "childs", null);
        setField(term39338, term39338.getClass(), "parent", term39360);
        setField(term39338, term39338.getClass(), "childs", term39361);
        setField(term39300, term39300.getClass(), "parent", term39338);
        setField(term39300, term39300.getClass(), "childs", term39367);
        setField(term39267, term39267.getClass(), "customerOrderGroup", term39300);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term39267, args);
    }

};


