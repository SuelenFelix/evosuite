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

public class CustomerOrderGroup_toString_11944379739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38290;

    public CustomerOrderGroup_toString_11944379739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38291 = new Long(-490278022171411868L);
        HashMap term38294 = new HashMap();
        Set<Object> term38353 =  ((Map) term38294).keySet();
        HashSet term38293 = new HashSet((Collection<? extends Object>) term38353);
        Long term38317 = new Long(-4983190578576857758L);
        Class<? extends Object> term38375 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term38374 = ((Class) term38375).getDeclaredField((String) "Admin");
        ((Field) term38374).setAccessible(true);
        Object enum109 = ((Field) term38374).get((Object) null);
        HashMap term38343 = new HashMap();
        Set<Object> term38571 =  ((Map) term38343).keySet();
        HashSet term38342 = new HashSet((Collection<? extends Object>) term38571);
        term38290 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term38316 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term38340 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term38341 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term38290, term38290.getClass(), "id", term38291);
        setField(term38290, term38290.getClass(), "orders", term38293);
        setField(term38290, term38290.getClass(), "description", "FtyaWnfsgn");
        setField(term38316, term38316.getClass(), "id", term38317);
        setField(term38316, term38316.getClass(), "name", "qphbpPdwrD");
        setField(term38316, term38316.getClass(), "type", enum109);
        setField(term38340, term38340.getClass(), "id", null);
        setField(term38340, term38340.getClass(), "orders", null);
        setField(term38340, term38340.getClass(), "description", null);
        setField(term38340, term38340.getClass(), "customer", null);
        setField(term38340, term38340.getClass(), "parent", null);
        setField(term38340, term38340.getClass(), "childs", null);
        setField(term38316, term38316.getClass(), "customerOrderGroup", term38340);
        setField(term38290, term38290.getClass(), "customer", term38316);
        setField(term38341, term38341.getClass(), "id", null);
        setField(term38341, term38341.getClass(), "orders", null);
        setField(term38341, term38341.getClass(), "description", null);
        setField(term38341, term38341.getClass(), "customer", null);
        setField(term38341, term38341.getClass(), "parent", null);
        setField(term38341, term38341.getClass(), "childs", null);
        setField(term38290, term38290.getClass(), "parent", term38341);
        setField(term38290, term38290.getClass(), "childs", term38342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.CustomerOrderGroup");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term38290, args);
    }

};


