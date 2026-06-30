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

public class PersonCandidate_getRoles_149507014319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8258;

    public PersonCandidate_getRoles_149507014319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8407 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term8406 = ((Class) term8407).getDeclaredField((String) "ACTIVE");
        ((Field) term8406).setAccessible(true);
        Object enum19 = ((Field) term8406).get((Object) null);
        term8258 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term8342 = newInstance(Class.forName("java.util.TreeSet"));
        Object term8343 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term8258, term8258.getClass(), "id", -6573104506744284592L);
        setField(term8258, term8258.getClass(), "firstName", "SdCKLMIYnX");
        setField(term8258, term8258.getClass(), "lastName", "OJJtVNPyKZ");
        setField(term8258, term8258.getClass(), "email", "AKNapTAfmD");
        setField(term8258, term8258.getClass(), "username", "xJgPlLxpgC");
        setField(term8258, term8258.getClass(), "password", "EYtfuJaxiM");
        setField(term8258, term8258.getClass(), "phone", "gCWtLVKVVe");
        setField(term8258, term8258.getClass(), "status", enum19);
        setField(term8343, term8343.getClass(), "comparator", null);
        setField(term8343, term8343.getClass(), "root", null);
        setIntField(term8343, term8343.getClass(), "size", 0);
        setIntField(term8343, term8343.getClass(), "modCount", 0);
        setField(term8343, term8343.getClass(), "entrySet", null);
        setField(term8343, term8343.getClass(), "navigableKeySet", null);
        setField(term8343, term8343.getClass(), "descendingMap", null);
        setField(term8343, term8343.getClass(), "keySet", null);
        setField(term8343, term8343.getClass(), "values", null);
        setField(term8342, term8342.getClass(), "m", term8343);
        setField(term8258, term8258.getClass(), "roles", term8342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term8258, args);
    }

};


