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

public class CustomerOrderGroup_getCustomerName_14986584341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33954;

    public CustomerOrderGroup_getCustomerName_14986584341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term33955 = new Long(-6104317529539097644L);
        HashMap term33958 = new HashMap();
        Set<Object> term34020 =  ((Map) term33958).keySet();
        HashSet term33957 = new HashSet((Collection<? extends Object>) term34020);
        Long term33981 = new Long(-1155047331993508760L);
        Class<? extends Object> term34042 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term34041 = ((Class) term34042).getDeclaredField((String) "Division");
        ((Field) term34041).setAccessible(true);
        Object enum94 = ((Field) term34041).get((Object) null);
        HashMap term34010 = new HashMap();
        Set<Object> term34247 =  ((Map) term34010).keySet();
        HashSet term34009 = new HashSet((Collection<? extends Object>) term34247);
        term33954 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term33980 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term34007 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term34008 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term33954, term33954.getClass(), "id", term33955);
        setField(term33954, term33954.getClass(), "orders", term33957);
        setField(term33954, term33954.getClass(), "description", "aGJCHRHyCe");
        setField(term33980, term33980.getClass(), "id", term33981);
        setField(term33980, term33980.getClass(), "name", "WingwhSgfc");
        setField(term33980, term33980.getClass(), "type", enum94);
        setField(term34007, term34007.getClass(), "id", null);
        setField(term34007, term34007.getClass(), "orders", null);
        setField(term34007, term34007.getClass(), "description", null);
        setField(term34007, term34007.getClass(), "customer", null);
        setField(term34007, term34007.getClass(), "parent", null);
        setField(term34007, term34007.getClass(), "childs", null);
        setField(term33980, term33980.getClass(), "customerOrderGroup", term34007);
        setField(term33954, term33954.getClass(), "customer", term33980);
        setField(term34008, term34008.getClass(), "id", null);
        setField(term34008, term34008.getClass(), "orders", null);
        setField(term34008, term34008.getClass(), "description", null);
        setField(term34008, term34008.getClass(), "customer", null);
        setField(term34008, term34008.getClass(), "parent", null);
        setField(term34008, term34008.getClass(), "childs", null);
        setField(term33954, term33954.getClass(), "parent", term34008);
        setField(term33954, term33954.getClass(), "childs", term34009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCustomerName", argTypes, term33954, args);
    }

};


