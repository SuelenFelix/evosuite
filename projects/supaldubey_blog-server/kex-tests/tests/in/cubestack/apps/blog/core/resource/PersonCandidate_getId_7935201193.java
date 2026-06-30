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

public class PersonCandidate_getId_7935201193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1262;

    public PersonCandidate_getId_7935201193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1412 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1411 = ((Class) term1412).getDeclaredField((String) "PENDING");
        ((Field) term1411).setAccessible(true);
        Object enum2 = ((Field) term1411).get((Object) null);
        term1262 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term1347 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1348 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term1262, term1262.getClass(), "id", 6375119433582206027L);
        setField(term1262, term1262.getClass(), "firstName", "OclPbYPkcH");
        setField(term1262, term1262.getClass(), "lastName", "IoAlmYsBwc");
        setField(term1262, term1262.getClass(), "email", "TEParAifyi");
        setField(term1262, term1262.getClass(), "username", "OWDIEULEFu");
        setField(term1262, term1262.getClass(), "password", "dWRymuLBtr");
        setField(term1262, term1262.getClass(), "phone", "AijpHYOFuy");
        setField(term1262, term1262.getClass(), "status", enum2);
        setField(term1348, term1348.getClass(), "comparator", null);
        setField(term1348, term1348.getClass(), "root", null);
        setIntField(term1348, term1348.getClass(), "size", 0);
        setIntField(term1348, term1348.getClass(), "modCount", 0);
        setField(term1348, term1348.getClass(), "entrySet", null);
        setField(term1348, term1348.getClass(), "navigableKeySet", null);
        setField(term1348, term1348.getClass(), "descendingMap", null);
        setField(term1348, term1348.getClass(), "keySet", null);
        setField(term1348, term1348.getClass(), "values", null);
        setField(term1347, term1347.getClass(), "m", term1348);
        setField(term1262, term1262.getClass(), "roles", term1347);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1262, args);
    }

};


