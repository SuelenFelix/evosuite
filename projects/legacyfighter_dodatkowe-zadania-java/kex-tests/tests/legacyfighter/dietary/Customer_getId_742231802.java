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

public class Customer_getId_742231802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39642;

    public Customer_getId_742231802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term39643 = new Long(-7986118407298160731L);
        Class<? extends Object> term39723 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term39722 = ((Class) term39723).getDeclaredField((String) "Company");
        ((Field) term39722).setAccessible(true);
        Object enum113 = ((Field) term39722).get((Object) null);
        Long term39669 = new Long(6721721782435142809L);
        HashMap term39672 = new HashMap();
        Set<Object> term39925 =  ((Map) term39672).keySet();
        HashSet term39671 = new HashSet((Collection<? extends Object>) term39925);
        Long term39691 = new Long(-405127137367295684L);
        HashMap term39706 = new HashMap();
        Set<Object> term39946 =  ((Map) term39706).keySet();
        HashSet term39705 = new HashSet((Collection<? extends Object>) term39946);
        term39642 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term39668 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term39690 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        setField(term39642, term39642.getClass(), "id", term39643);
        setField(term39642, term39642.getClass(), "name", "VclIptmKrF");
        setField(term39642, term39642.getClass(), "type", enum113);
        setField(term39668, term39668.getClass(), "id", term39669);
        setField(term39668, term39668.getClass(), "orders", term39671);
        setField(term39668, term39668.getClass(), "description", "bXInWdOeyi");
        setField(term39690, term39690.getClass(), "id", term39691);
        setField(term39690, term39690.getClass(), "name", "HdwopulXkf");
        setField(term39690, term39690.getClass(), "type", enum113);
        setField(term39690, term39690.getClass(), "customerOrderGroup", term39668);
        setField(term39668, term39668.getClass(), "customer", term39690);
        setField(term39668, term39668.getClass(), "parent", term39668);
        setField(term39668, term39668.getClass(), "childs", term39705);
        setField(term39642, term39642.getClass(), "customerOrderGroup", term39668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term39642, args);
    }

};


