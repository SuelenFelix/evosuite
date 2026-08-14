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

public class CustomerOrderGroup_getParent_1214598072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34248;

    public CustomerOrderGroup_getParent_1214598072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34249 = new Long(3144720397872891648L);
        HashMap term34252 = new HashMap();
        Set<Object> term34315 =  ((Map) term34252).keySet();
        HashSet term34251 = new HashSet((Collection<? extends Object>) term34315);
        Long term34277 = new Long(192472706552396960L);
        Class<? extends Object> term34337 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term34336 = ((Class) term34337).getDeclaredField((String) "Company");
        ((Field) term34336).setAccessible(true);
        Object enum95 = ((Field) term34336).get((Object) null);
        HashMap term34305 = new HashMap();
        Set<Object> term34539 =  ((Map) term34305).keySet();
        HashSet term34304 = new HashSet((Collection<? extends Object>) term34539);
        term34248 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34276 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34302 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34303 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term34248, term34248.getClass(), "id", term34249);
        setField(term34248, term34248.getClass(), "orders", term34251);
        setField(term34248, term34248.getClass(), "description", "qakIqInzyM");
        setField(term34276, term34276.getClass(), "id", term34277);
        setField(term34276, term34276.getClass(), "name", "EOsBgwlmva");
        setField(term34276, term34276.getClass(), "type", enum95);
        setField(term34302, term34302.getClass(), "id", null);
        setField(term34302, term34302.getClass(), "orders", null);
        setField(term34302, term34302.getClass(), "description", null);
        setField(term34302, term34302.getClass(), "customer", null);
        setField(term34302, term34302.getClass(), "parent", null);
        setField(term34302, term34302.getClass(), "childs", null);
        setField(term34276, term34276.getClass(), "customerOrderGroup", term34302);
        setField(term34248, term34248.getClass(), "customer", term34276);
        setField(term34303, term34303.getClass(), "id", null);
        setField(term34303, term34303.getClass(), "orders", null);
        setField(term34303, term34303.getClass(), "description", null);
        setField(term34303, term34303.getClass(), "customer", null);
        setField(term34303, term34303.getClass(), "parent", null);
        setField(term34303, term34303.getClass(), "childs", null);
        setField(term34248, term34248.getClass(), "parent", term34303);
        setField(term34248, term34248.getClass(), "childs", term34304);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getParent", argTypes, term34248, args);
    }

};


