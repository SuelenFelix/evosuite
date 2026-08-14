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

public class CustomerOrderGroup_getOrders_7648017053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34540;

    public CustomerOrderGroup_getOrders_7648017053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34541 = new Long(-3992275333926350693L);
        HashMap term34544 = new HashMap();
        Set<Object> term34639 =  ((Map) term34544).keySet();
        HashSet term34543 = new HashSet((Collection<? extends Object>) term34639);
        Long term34573 = new Long(475216242691154379L);
        Class<? extends Object> term34661 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term34660 = ((Class) term34661).getDeclaredField((String) "Company");
        ((Field) term34660).setAccessible(true);
        Object enum96 = ((Field) term34660).get((Object) null);
        Long term34599 = new Long(7775145417632389147L);
        HashMap term34602 = new HashMap();
        Set<Object> term34863 =  ((Map) term34602).keySet();
        HashSet term34601 = new HashSet((Collection<? extends Object>) term34863);
        Long term34620 = new Long(-6895327543559831172L);
        Long term34624 = new Long(-180231083568368234L);
        HashMap term34627 = new HashMap();
        Set<Object> term34874 =  ((Map) term34627).keySet();
        HashSet term34626 = new HashSet((Collection<? extends Object>) term34874);
        HashMap term34634 = new HashMap();
        Set<Object> term34875 =  ((Map) term34634).keySet();
        HashSet term34633 = new HashSet((Collection<? extends Object>) term34875);
        term34540 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34572 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34598 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34619 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34623 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34632 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term34540, term34540.getClass(), "id", term34541);
        setField(term34540, term34540.getClass(), "orders", term34543);
        setField(term34540, term34540.getClass(), "description", "AaxnITALtd");
        setField(term34572, term34572.getClass(), "id", term34573);
        setField(term34572, term34572.getClass(), "name", "RdnRRpWglh");
        setField(term34572, term34572.getClass(), "type", enum96);
        setField(term34598, term34598.getClass(), "id", term34599);
        setField(term34598, term34598.getClass(), "orders", term34601);
        setField(term34598, term34598.getClass(), "description", "OUrtbTvuiW");
        setField(term34619, term34619.getClass(), "id", term34620);
        setField(term34619, term34619.getClass(), "name", "");
        setField(term34619, term34619.getClass(), "type", enum96);
        setField(term34623, term34623.getClass(), "id", term34624);
        setField(term34623, term34623.getClass(), "orders", null);
        setField(term34623, term34623.getClass(), "description", null);
        setField(term34623, term34623.getClass(), "customer", null);
        setField(term34623, term34623.getClass(), "parent", null);
        setField(term34623, term34623.getClass(), "childs", null);
        setField(term34619, term34619.getClass(), "customerOrderGroup", term34623);
        setField(term34598, term34598.getClass(), "customer", term34619);
        setField(term34598, term34598.getClass(), "parent", term34623);
        setField(term34598, term34598.getClass(), "childs", term34626);
        setField(term34572, term34572.getClass(), "customerOrderGroup", term34598);
        setField(term34540, term34540.getClass(), "customer", term34572);
        setField(term34632, term34632.getClass(), "id", null);
        setField(term34632, term34632.getClass(), "orders", null);
        setField(term34632, term34632.getClass(), "description", null);
        setField(term34632, term34632.getClass(), "customer", null);
        setField(term34632, term34632.getClass(), "parent", null);
        setField(term34632, term34632.getClass(), "childs", null);
        setField(term34540, term34540.getClass(), "parent", term34632);
        setField(term34540, term34540.getClass(), "childs", term34633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOrders", argTypes, term34540, args);
    }

};


