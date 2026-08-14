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

public class CustomerDto_init_20129080560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45971;

    public CustomerDto_init_20129080560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45972 = new Long(-5290478444594322181L);
        Class<? extends Object> term46058 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term46057 = ((Class) term46058).getDeclaredField((String) "Division");
        ((Field) term46057).setAccessible(true);
        Object enum133 = ((Field) term46057).get((Object) null);
        Long term45999 = new Long(-113007539486440473L);
        HashMap term46002 = new HashMap();
        Set<Object> term46263 =  ((Map) term46002).keySet();
        HashSet term46001 = new HashSet((Collection<? extends Object>) term46263);
        Long term46021 = new Long(7779093916932577607L);
        Class<? extends Object> term46285 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term46284 = ((Class) term46285).getDeclaredField((String) "Admin");
        ((Field) term46284).setAccessible(true);
        Object enum134 = ((Field) term46284).get((Object) null);
        HashMap term46041 = new HashMap();
        Set<Object> term46481 =  ((Map) term46041).keySet();
        HashSet term46040 = new HashSet((Collection<? extends Object>) term46481);
        term45971 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term45998 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term46020 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term46038 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term46039 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term45971, term45971.getClass(), "id", term45972);
        setField(term45971, term45971.getClass(), "name", "gVgLmqgxMh");
        setField(term45971, term45971.getClass(), "type", enum133);
        setField(term45998, term45998.getClass(), "id", term45999);
        setField(term45998, term45998.getClass(), "orders", term46001);
        setField(term45998, term45998.getClass(), "description", "GUXdlpmVNQ");
        setField(term46020, term46020.getClass(), "id", term46021);
        setField(term46020, term46020.getClass(), "name", "QxSwOpnogl");
        setField(term46020, term46020.getClass(), "type", enum134);
        setField(term46038, term46038.getClass(), "id", null);
        setField(term46038, term46038.getClass(), "orders", null);
        setField(term46038, term46038.getClass(), "description", null);
        setField(term46038, term46038.getClass(), "customer", null);
        setField(term46038, term46038.getClass(), "parent", null);
        setField(term46038, term46038.getClass(), "childs", null);
        setField(term46020, term46020.getClass(), "customerOrderGroup", term46038);
        setField(term45998, term45998.getClass(), "customer", term46020);
        setField(term46039, term46039.getClass(), "id", null);
        setField(term46039, term46039.getClass(), "orders", null);
        setField(term46039, term46039.getClass(), "description", null);
        setField(term46039, term46039.getClass(), "customer", null);
        setField(term46039, term46039.getClass(), "parent", null);
        setField(term46039, term46039.getClass(), "childs", null);
        setField(term45998, term45998.getClass(), "parent", term46039);
        setField(term45998, term45998.getClass(), "childs", term46040);
        setField(term45971, term45971.getClass(), "customerOrderGroup", term45998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerDto");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("legacyfighter.dietary.Customer");
        Object[] args = new Object[1];
        args[0] = term45971;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


