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

public class PersonCandidate_setLastName_13885838848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3350;

    public PersonCandidate_setLastName_13885838848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3512 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term3511 = ((Class) term3512).getDeclaredField((String) "PENDING");
        ((Field) term3511).setAccessible(true);
        Object enum7 = ((Field) term3511).get((Object) null);
        term3350 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term3435 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3436 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term3350, term3350.getClass(), "id", 6811161968424632369L);
        setField(term3350, term3350.getClass(), "firstName", "ytSBIKXogI");
        setField(term3350, term3350.getClass(), "lastName", "nHXjMycHlU");
        setField(term3350, term3350.getClass(), "email", "ieCtQFdkii");
        setField(term3350, term3350.getClass(), "username", "dEnhdmILtU");
        setField(term3350, term3350.getClass(), "password", "hoicvmsovO");
        setField(term3350, term3350.getClass(), "phone", "eqJfYWRaEL");
        setField(term3350, term3350.getClass(), "status", enum7);
        setField(term3436, term3436.getClass(), "comparator", null);
        setField(term3436, term3436.getClass(), "root", null);
        setIntField(term3436, term3436.getClass(), "size", 0);
        setIntField(term3436, term3436.getClass(), "modCount", 0);
        setField(term3436, term3436.getClass(), "entrySet", null);
        setField(term3436, term3436.getClass(), "navigableKeySet", null);
        setField(term3436, term3436.getClass(), "descendingMap", null);
        setField(term3436, term3436.getClass(), "keySet", null);
        setField(term3436, term3436.getClass(), "values", null);
        setField(term3435, term3435.getClass(), "m", term3436);
        setField(term3350, term3350.getClass(), "roles", term3435);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fhkbdRViHi";
        callMethod(klass, "setLastName", argTypes, term3350, args);
    }

};


