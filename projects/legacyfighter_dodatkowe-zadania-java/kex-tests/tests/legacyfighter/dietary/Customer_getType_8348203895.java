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

public class Customer_getType_8348203895 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41056;

    public Customer_getType_8348203895() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41057 = new Long(8104096721239680583L);
        Class<? extends Object> term41177 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term41176 = ((Class) term41177).getDeclaredField((String) "Representative");
        ((Field) term41176).setAccessible(true);
        Object enum118 = ((Field) term41176).get((Object) null);
        Long term41090 = new Long(1132566737750531256L);
        HashMap term41093 = new HashMap();
        Set<Object> term41400 =  ((Map) term41093).keySet();
        HashSet term41092 = new HashSet((Collection<? extends Object>) term41400);
        Long term41112 = new Long(-8340412977479666356L);
        Class<? extends Object> term41422 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term41421 = ((Class) term41422).getDeclaredField((String) "Division");
        ((Field) term41421).setAccessible(true);
        Object enum119 = ((Field) term41421).get((Object) null);
        Long term41131 = new Long(-8963879630647796485L);
        HashMap term41134 = new HashMap();
        Set<Object> term41627 =  ((Map) term41134).keySet();
        HashSet term41133 = new HashSet((Collection<? extends Object>) term41627);
        HashMap term41154 = new HashMap();
        Set<Object> term41638 =  ((Map) term41154).keySet();
        HashSet term41153 = new HashSet((Collection<? extends Object>) term41638);
        HashMap term41160 = new HashMap();
        Set<Object> term41639 =  ((Map) term41160).keySet();
        HashSet term41159 = new HashSet((Collection<? extends Object>) term41639);
        term41056 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41089 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41111 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41129 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41130 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term41151 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term41152 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term41056, term41056.getClass(), "id", term41057);
        setField(term41056, term41056.getClass(), "name", "INFnBrMIka");
        setField(term41056, term41056.getClass(), "type", enum118);
        setField(term41089, term41089.getClass(), "id", term41090);
        setField(term41089, term41089.getClass(), "orders", term41092);
        setField(term41089, term41089.getClass(), "description", "HHAfSjIdNi");
        setField(term41111, term41111.getClass(), "id", term41112);
        setField(term41111, term41111.getClass(), "name", "oTqQEKklHi");
        setField(term41111, term41111.getClass(), "type", enum119);
        setField(term41129, term41129.getClass(), "id", null);
        setField(term41129, term41129.getClass(), "orders", null);
        setField(term41129, term41129.getClass(), "description", null);
        setField(term41129, term41129.getClass(), "customer", null);
        setField(term41129, term41129.getClass(), "parent", null);
        setField(term41129, term41129.getClass(), "childs", null);
        setField(term41111, term41111.getClass(), "customerOrderGroup", term41129);
        setField(term41089, term41089.getClass(), "customer", term41111);
        setField(term41130, term41130.getClass(), "id", term41131);
        setField(term41130, term41130.getClass(), "orders", term41133);
        setField(term41130, term41130.getClass(), "description", "EwmpEgdvZs");
        setField(term41151, term41151.getClass(), "id", null);
        setField(term41151, term41151.getClass(), "name", null);
        setField(term41151, term41151.getClass(), "type", null);
        setField(term41151, term41151.getClass(), "customerOrderGroup", null);
        setField(term41130, term41130.getClass(), "customer", term41151);
        setField(term41152, term41152.getClass(), "id", null);
        setField(term41152, term41152.getClass(), "orders", null);
        setField(term41152, term41152.getClass(), "description", null);
        setField(term41152, term41152.getClass(), "customer", null);
        setField(term41152, term41152.getClass(), "parent", null);
        setField(term41152, term41152.getClass(), "childs", null);
        setField(term41130, term41130.getClass(), "parent", term41152);
        setField(term41130, term41130.getClass(), "childs", term41153);
        setField(term41089, term41089.getClass(), "parent", term41130);
        setField(term41089, term41089.getClass(), "childs", term41159);
        setField(term41056, term41056.getClass(), "customerOrderGroup", term41089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term41056, args);
    }

};


