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

public class Customer_getCustomerOrderGroup_11674523097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42157;

    public Customer_getCustomerOrderGroup_11674523097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term42158 = new Long(4829676996843735281L);
        Class<? extends Object> term42252 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term42251 = ((Class) term42252).getDeclaredField((String) "Division");
        ((Field) term42251).setAccessible(true);
        Object enum122 = ((Field) term42251).get((Object) null);
        Long term42185 = new Long(1421677180758822434L);
        HashMap term42188 = new HashMap();
        Set<Object> term42457 =  ((Map) term42188).keySet();
        HashSet term42187 = new HashSet((Collection<? extends Object>) term42457);
        Long term42207 = new Long(6759285425911636341L);
        Class<? extends Object> term42479 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term42478 = ((Class) term42479).getDeclaredField((String) "Admin");
        ((Field) term42478).setAccessible(true);
        Object enum123 = ((Field) term42478).get((Object) null);
        Long term42225 = new Long(-8846138397677255464L);
        HashSet term42227 = new HashSet();
        Long term42230 = new Long(4472414114652978334L);
        HashSet term42232 = new HashSet();
        HashMap term42235 = new HashMap();
        Set<Object> term42675 =  ((Map) term42235).keySet();
        HashSet term42234 = new HashSet((Collection<? extends Object>) term42675);
        term42157 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42184 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42206 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42224 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term42229 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term42233 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term42157, term42157.getClass(), "id", term42158);
        setField(term42157, term42157.getClass(), "name", "OoRBUdwown");
        setField(term42157, term42157.getClass(), "type", enum122);
        setField(term42184, term42184.getClass(), "id", term42185);
        setField(term42184, term42184.getClass(), "orders", term42187);
        setField(term42184, term42184.getClass(), "description", "jvQHxWAYDO");
        setField(term42206, term42206.getClass(), "id", term42207);
        setField(term42206, term42206.getClass(), "name", "mntnLPfhte");
        setField(term42206, term42206.getClass(), "type", enum123);
        setField(term42224, term42224.getClass(), "id", term42225);
        setField(term42224, term42224.getClass(), "orders", term42227);
        setField(term42224, term42224.getClass(), "description", "");
        setField(term42229, term42229.getClass(), "id", term42230);
        setField(term42229, term42229.getClass(), "name", null);
        setField(term42229, term42229.getClass(), "type", null);
        setField(term42229, term42229.getClass(), "customerOrderGroup", null);
        setField(term42224, term42224.getClass(), "customer", term42229);
        setField(term42224, term42224.getClass(), "parent", term42184);
        setField(term42224, term42224.getClass(), "childs", term42232);
        setField(term42206, term42206.getClass(), "customerOrderGroup", term42224);
        setField(term42184, term42184.getClass(), "customer", term42206);
        setField(term42233, term42233.getClass(), "id", null);
        setField(term42233, term42233.getClass(), "orders", null);
        setField(term42233, term42233.getClass(), "description", null);
        setField(term42233, term42233.getClass(), "customer", null);
        setField(term42233, term42233.getClass(), "parent", null);
        setField(term42233, term42233.getClass(), "childs", null);
        setField(term42184, term42184.getClass(), "parent", term42233);
        setField(term42184, term42184.getClass(), "childs", term42234);
        setField(term42157, term42157.getClass(), "customerOrderGroup", term42184);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerOrderGroup", argTypes, term42157, args);
    }

};


