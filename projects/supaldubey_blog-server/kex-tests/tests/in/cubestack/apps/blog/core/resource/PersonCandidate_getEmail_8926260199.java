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

public class PersonCandidate_getEmail_8926260199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3784;

    public PersonCandidate_getEmail_8926260199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3933 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term3932 = ((Class) term3933).getDeclaredField((String) "ACTIVE");
        ((Field) term3932).setAccessible(true);
        Object enum8 = ((Field) term3932).get((Object) null);
        term3784 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term3868 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3869 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term3784, term3784.getClass(), "id", -7237588299778557629L);
        setField(term3784, term3784.getClass(), "firstName", "uWHnvSvaPl");
        setField(term3784, term3784.getClass(), "lastName", "kBdSllIBVz");
        setField(term3784, term3784.getClass(), "email", "TJmVBGfTML");
        setField(term3784, term3784.getClass(), "username", "tPlsykYBqO");
        setField(term3784, term3784.getClass(), "password", "bLPjGVBhlX");
        setField(term3784, term3784.getClass(), "phone", "whBvTVIIlC");
        setField(term3784, term3784.getClass(), "status", enum8);
        setField(term3869, term3869.getClass(), "comparator", null);
        setField(term3869, term3869.getClass(), "root", null);
        setIntField(term3869, term3869.getClass(), "size", 0);
        setIntField(term3869, term3869.getClass(), "modCount", 0);
        setField(term3869, term3869.getClass(), "entrySet", null);
        setField(term3869, term3869.getClass(), "navigableKeySet", null);
        setField(term3869, term3869.getClass(), "descendingMap", null);
        setField(term3869, term3869.getClass(), "keySet", null);
        setField(term3869, term3869.getClass(), "values", null);
        setField(term3868, term3868.getClass(), "m", term3869);
        setField(term3784, term3784.getClass(), "roles", term3868);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term3784, args);
    }

};


