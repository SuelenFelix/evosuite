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

public class PersonCandidate_getStatus_44727663217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7156;

    public PersonCandidate_getStatus_44727663217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7307 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term7306 = ((Class) term7307).getDeclaredField((String) "DISABLED");
        ((Field) term7306).setAccessible(true);
        Object enum16 = ((Field) term7306).get((Object) null);
        term7156 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term7242 = newInstance(Class.forName("java.util.TreeSet"));
        Object term7243 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term7156, term7156.getClass(), "id", -316468845751588286L);
        setField(term7156, term7156.getClass(), "firstName", "XylxrMBraH");
        setField(term7156, term7156.getClass(), "lastName", "pORebkoRdD");
        setField(term7156, term7156.getClass(), "email", "mXGCWJDOqA");
        setField(term7156, term7156.getClass(), "username", "dpNsDgfPso");
        setField(term7156, term7156.getClass(), "password", "hCWPJQKpdc");
        setField(term7156, term7156.getClass(), "phone", "WzMEhMXkKx");
        setField(term7156, term7156.getClass(), "status", enum16);
        setField(term7243, term7243.getClass(), "comparator", null);
        setField(term7243, term7243.getClass(), "root", null);
        setIntField(term7243, term7243.getClass(), "size", 0);
        setIntField(term7243, term7243.getClass(), "modCount", 0);
        setField(term7243, term7243.getClass(), "entrySet", null);
        setField(term7243, term7243.getClass(), "navigableKeySet", null);
        setField(term7243, term7243.getClass(), "descendingMap", null);
        setField(term7243, term7243.getClass(), "keySet", null);
        setField(term7243, term7243.getClass(), "values", null);
        setField(term7242, term7242.getClass(), "m", term7243);
        setField(term7156, term7156.getClass(), "roles", term7242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStatus", argTypes, term7156, args);
    }

};


