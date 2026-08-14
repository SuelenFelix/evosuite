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

public class Customer_setType_21370698696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41640;
     Object enum121;

    public Customer_setType_21370698696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41641 = new Long(5072151233307900881L);
        Class<? extends Object> term41739 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term41738 = ((Class) term41739).getDeclaredField((String) "Admin");
        ((Field) term41738).setAccessible(true);
        Object enum120 = ((Field) term41738).get((Object) null);
        Long term41665 = new Long(2250556415549346949L);
        HashMap term41668 = new HashMap();
        Set<Object> term41935 =  ((Map) term41668).keySet();
        HashSet term41667 = new HashSet((Collection<? extends Object>) term41935);
        Long term41686 = new Long(-4674840583005034118L);
        Long term41701 = new Long(3952299423271006072L);
        HashSet term41703 = new HashSet();
        Long term41706 = new Long(6681879584837155391L);
        HashSet term41709 = new HashSet();
        HashMap term41712 = new HashMap();
        Set<Object> term41956 =  ((Map) term41712).keySet();
        HashSet term41711 = new HashSet((Collection<? extends Object>) term41956);
        term41640 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41664 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41685 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41700 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41705 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41708 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41710 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term41640, term41640.getClass(), "id", term41641);
        setField(term41640, term41640.getClass(), "name", "riyKkxMvWm");
        setField(term41640, term41640.getClass(), "type", enum120);
        setField(term41664, term41664.getClass(), "id", term41665);
        setField(term41664, term41664.getClass(), "orders", term41667);
        setField(term41664, term41664.getClass(), "description", "WENnGcBSTd");
        setField(term41685, term41685.getClass(), "id", term41686);
        setField(term41685, term41685.getClass(), "name", "juEYcOCxLW");
        setField(term41685, term41685.getClass(), "type", enum120);
        setField(term41700, term41700.getClass(), "id", term41701);
        setField(term41700, term41700.getClass(), "orders", term41703);
        setField(term41700, term41700.getClass(), "description", "");
        setField(term41705, term41705.getClass(), "id", term41706);
        setField(term41705, term41705.getClass(), "name", null);
        setField(term41705, term41705.getClass(), "type", enum120);
        setField(term41705, term41705.getClass(), "customerOrderGroup", null);
        setField(term41700, term41700.getClass(), "customer", term41705);
        setField(term41708, term41708.getClass(), "id", null);
        setField(term41708, term41708.getClass(), "orders", null);
        setField(term41708, term41708.getClass(), "description", null);
        setField(term41708, term41708.getClass(), "customer", null);
        setField(term41708, term41708.getClass(), "parent", null);
        setField(term41708, term41708.getClass(), "childs", null);
        setField(term41700, term41700.getClass(), "parent", term41708);
        setField(term41700, term41700.getClass(), "childs", term41709);
        setField(term41685, term41685.getClass(), "customerOrderGroup", term41700);
        setField(term41664, term41664.getClass(), "customer", term41685);
        setField(term41710, term41710.getClass(), "id", null);
        setField(term41710, term41710.getClass(), "orders", null);
        setField(term41710, term41710.getClass(), "description", null);
        setField(term41710, term41710.getClass(), "customer", null);
        setField(term41710, term41710.getClass(), "parent", null);
        setField(term41710, term41710.getClass(), "childs", null);
        setField(term41664, term41664.getClass(), "parent", term41710);
        setField(term41664, term41664.getClass(), "childs", term41711);
        setField(term41640, term41640.getClass(), "customerOrderGroup", term41664);
        Class<? extends Object> term41958 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term41957 = ((Class) term41958).getDeclaredField((String) "Person");
        ((Field) term41957).setAccessible(true);
        enum121 = ((Field) term41957).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Customer$Type");
        Object[] args = new Object[1];
        args[0] = enum121;
        callMethod(klass, "setType", argTypes, term41640, args);
    }

};


