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

public class Customer_hashCode_14905203810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44090;

    public Customer_hashCode_14905203810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term44091 = new Long(308309058288153545L);
        Class<? extends Object> term44179 = Class.forName((String) "legacyfighter.dietary.Customer$Type");
        Field term44178 = ((Class) term44179).getDeclaredField((String) "Admin");
        ((Field) term44178).setAccessible(true);
        Object enum129 = ((Field) term44178).get((Object) null);
        Long term44115 = new Long(2769769615541963064L);
        HashMap term44118 = new HashMap();
        Set<Object> term44375 =  ((Map) term44118).keySet();
        HashSet term44117 = new HashSet((Collection<? extends Object>) term44375);
        Long term44137 = new Long(-6264785127930873499L);
        Long term44152 = new Long(2739506880892071716L);
        HashSet term44154 = new HashSet();
        Long term44157 = new Long(-1856029526365001621L);
        HashSet term44160 = new HashSet();
        HashMap term44162 = new HashMap();
        Set<Object> term44396 =  ((Map) term44162).keySet();
        HashSet term44161 = new HashSet((Collection<? extends Object>) term44396);
        term44090 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term44114 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term44136 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term44151 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        Object term44156 = newInstance(Class.forName("legacyfighter.dietary.Customer"));
        Object term44159 = newInstance(Class.forName("legacyfighter.dietary.CustomerOrderGroup"));
        setField(term44090, term44090.getClass(), "id", term44091);
        setField(term44090, term44090.getClass(), "name", "zeBhlhyhkL");
        setField(term44090, term44090.getClass(), "type", enum129);
        setField(term44114, term44114.getClass(), "id", term44115);
        setField(term44114, term44114.getClass(), "orders", term44117);
        setField(term44114, term44114.getClass(), "description", "VhnistEcCA");
        setField(term44136, term44136.getClass(), "id", term44137);
        setField(term44136, term44136.getClass(), "name", "hlPKLObFBU");
        setField(term44136, term44136.getClass(), "type", enum129);
        setField(term44151, term44151.getClass(), "id", term44152);
        setField(term44151, term44151.getClass(), "orders", term44154);
        setField(term44151, term44151.getClass(), "description", "");
        setField(term44156, term44156.getClass(), "id", term44157);
        setField(term44156, term44156.getClass(), "name", null);
        setField(term44156, term44156.getClass(), "type", enum129);
        setField(term44156, term44156.getClass(), "customerOrderGroup", null);
        setField(term44151, term44151.getClass(), "customer", term44156);
        setField(term44159, term44159.getClass(), "id", null);
        setField(term44159, term44159.getClass(), "orders", null);
        setField(term44159, term44159.getClass(), "description", null);
        setField(term44159, term44159.getClass(), "customer", null);
        setField(term44159, term44159.getClass(), "parent", null);
        setField(term44159, term44159.getClass(), "childs", null);
        setField(term44151, term44151.getClass(), "parent", term44159);
        setField(term44151, term44151.getClass(), "childs", term44160);
        setField(term44136, term44136.getClass(), "customerOrderGroup", term44151);
        setField(term44114, term44114.getClass(), "customer", term44136);
        setField(term44114, term44114.getClass(), "parent", term44159);
        setField(term44114, term44114.getClass(), "childs", term44161);
        setField(term44090, term44090.getClass(), "customerOrderGroup", term44114);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("legacyfighter.dietary.Customer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term44090, args);
    }

};


