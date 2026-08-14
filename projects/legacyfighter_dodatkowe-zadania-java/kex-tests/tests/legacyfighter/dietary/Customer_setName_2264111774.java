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

public class Customer_setName_2264111774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40450;

    public Customer_setName_2264111774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40451 = new Long(-5876369379613954614L);
        Class<? extends Object> term40589 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term40588 = ((Class) term40589).getDeclaredField((String) "Person");
        ((Field) term40588).setAccessible(true);
        Object enum116 = ((Field) term40588).get((Object) null);
        Long term40476 = new Long(9069442033463962750L);
        HashMap term40479 = new HashMap();
        Set<Object> term40788 =  ((Map) term40479).keySet();
        HashSet term40478 = new HashSet((Collection<? extends Object>) term40788);
        Long term40498 = new Long(9165671796313176705L);
        Long term40514 = new Long(-4244720445894600013L);
        HashMap term40517 = new HashMap();
        Set<Object> term40809 =  ((Map) term40517).keySet();
        HashSet term40516 = new HashSet((Collection<? extends Object>) term40809);
        Long term40535 = new Long(-1789728735275535628L);
        Class<? extends Object> term40821 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term40820 = ((Class) term40821).getDeclaredField((String) "Representative");
        ((Field) term40820).setAccessible(true);
        Object enum117 = ((Field) term40820).get((Object) null);
        Long term40542 = new Long(4165201970048882126L);
        HashSet term40544 = new HashSet();
        Long term40547 = new Long(1713132989163348687L);
        Long term40550 = new Long(5499210513338318618L);
        HashSet term40552 = new HashSet();
        HashMap term40554 = new HashMap();
        Set<Object> term41044 =  ((Map) term40554).keySet();
        HashSet term40553 = new HashSet((Collection<? extends Object>) term41044);
        HashMap term40560 = new HashMap();
        Set<Object> term41045 =  ((Map) term40560).keySet();
        HashSet term40559 = new HashSet((Collection<? extends Object>) term41045);
        term40450 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term40475 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40497 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term40512 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40513 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40534 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term40540 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40541 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term40546 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term40549 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term40450, term40450.getClass(), "id", term40451);
        setField(term40450, term40450.getClass(), "name", "dnYvoLZjCf");
        setField(term40450, term40450.getClass(), "type", enum116);
        setField(term40475, term40475.getClass(), "id", term40476);
        setField(term40475, term40475.getClass(), "orders", term40478);
        setField(term40475, term40475.getClass(), "description", "vStdEtWvae");
        setField(term40497, term40497.getClass(), "id", term40498);
        setField(term40497, term40497.getClass(), "name", "iApJWgnQkP");
        setField(term40497, term40497.getClass(), "type", enum116);
        setField(term40512, term40512.getClass(), "id", null);
        setField(term40512, term40512.getClass(), "orders", null);
        setField(term40512, term40512.getClass(), "description", null);
        setField(term40512, term40512.getClass(), "customer", null);
        setField(term40512, term40512.getClass(), "parent", null);
        setField(term40512, term40512.getClass(), "childs", null);
        setField(term40497, term40497.getClass(), "customerOrderGroup", term40512);
        setField(term40475, term40475.getClass(), "customer", term40497);
        setField(term40513, term40513.getClass(), "id", term40514);
        setField(term40513, term40513.getClass(), "orders", term40516);
        setField(term40513, term40513.getClass(), "description", "vSbbcByIuA");
        setField(term40534, term40534.getClass(), "id", term40535);
        setField(term40534, term40534.getClass(), "name", "");
        setField(term40534, term40534.getClass(), "type", enum117);
        setField(term40540, term40540.getClass(), "id", null);
        setField(term40540, term40540.getClass(), "orders", null);
        setField(term40540, term40540.getClass(), "description", null);
        setField(term40540, term40540.getClass(), "customer", null);
        setField(term40540, term40540.getClass(), "parent", null);
        setField(term40540, term40540.getClass(), "childs", null);
        setField(term40534, term40534.getClass(), "customerOrderGroup", term40540);
        setField(term40513, term40513.getClass(), "customer", term40534);
        setField(term40541, term40541.getClass(), "id", term40542);
        setField(term40541, term40541.getClass(), "orders", term40544);
        setField(term40541, term40541.getClass(), "description", "");
        setField(term40546, term40546.getClass(), "id", term40547);
        setField(term40546, term40546.getClass(), "name", null);
        setField(term40546, term40546.getClass(), "type", null);
        setField(term40546, term40546.getClass(), "customerOrderGroup", null);
        setField(term40541, term40541.getClass(), "customer", term40546);
        setField(term40549, term40549.getClass(), "id", term40550);
        setField(term40549, term40549.getClass(), "orders", null);
        setField(term40549, term40549.getClass(), "description", null);
        setField(term40549, term40549.getClass(), "customer", null);
        setField(term40549, term40549.getClass(), "parent", term40549);
        setField(term40549, term40549.getClass(), "childs", null);
        setField(term40541, term40541.getClass(), "parent", term40549);
        setField(term40541, term40541.getClass(), "childs", term40552);
        setField(term40513, term40513.getClass(), "parent", term40541);
        setField(term40513, term40513.getClass(), "childs", term40553);
        setField(term40475, term40475.getClass(), "parent", term40513);
        setField(term40475, term40475.getClass(), "childs", term40559);
        setField(term40450, term40450.getClass(), "customerOrderGroup", term40475);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "kHKzzYJxiP";
        callMethod(klass, "setName", argTypes, term40450, args);
    }

};


