package in.cubestack.apps.blog.core.resource;

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
import static in.cubestack.apps.blog.core.resource.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PersonCandidate_getFirstName_3404202545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092;

    public PersonCandidate_getFirstName_3404202545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2242 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term2241 = ((Class) term2242).getDeclaredField((String) "PENDING");
        ((Field) term2241).setAccessible(true);
        Object enum4 = ((Field) term2241).get((Object) null);
        term2092 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term2177 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2178 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term2092, term2092.getClass(), "id", 5270370404989704783L);
        setField(term2092, term2092.getClass(), "firstName", "aKnKipADSo");
        setField(term2092, term2092.getClass(), "lastName", "wSQxaModmm");
        setField(term2092, term2092.getClass(), "email", "UlajhuVLaP");
        setField(term2092, term2092.getClass(), "username", "gGSMzuGICf");
        setField(term2092, term2092.getClass(), "password", "hxCBltsObl");
        setField(term2092, term2092.getClass(), "phone", "BndsHwAFMv");
        setField(term2092, term2092.getClass(), "status", enum4);
        setField(term2178, term2178.getClass(), "comparator", null);
        setField(term2178, term2178.getClass(), "root", null);
        setIntField(term2178, term2178.getClass(), "size", 0);
        setIntField(term2178, term2178.getClass(), "modCount", 0);
        setField(term2178, term2178.getClass(), "entrySet", null);
        setField(term2178, term2178.getClass(), "navigableKeySet", null);
        setField(term2178, term2178.getClass(), "descendingMap", null);
        setField(term2178, term2178.getClass(), "keySet", null);
        setField(term2178, term2178.getClass(), "values", null);
        setField(term2177, term2177.getClass(), "m", term2178);
        setField(term2092, term2092.getClass(), "roles", term2177);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term2092, args);
    }

};


