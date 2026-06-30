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

public class PersonCandidate_getPassword_180672619413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5468;

    public PersonCandidate_getPassword_180672619413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5617 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term5616 = ((Class) term5617).getDeclaredField((String) "ACTIVE");
        ((Field) term5616).setAccessible(true);
        Object enum12 = ((Field) term5616).get((Object) null);
        term5468 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term5552 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5553 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term5468, term5468.getClass(), "id", -4325723315152823407L);
        setField(term5468, term5468.getClass(), "firstName", "xOcJIiQQDu");
        setField(term5468, term5468.getClass(), "lastName", "GVizqqzXpy");
        setField(term5468, term5468.getClass(), "email", "JqXGgAhZPl");
        setField(term5468, term5468.getClass(), "username", "jiKYgYHqIS");
        setField(term5468, term5468.getClass(), "password", "DfISiziTgG");
        setField(term5468, term5468.getClass(), "phone", "XqgfKFvPSD");
        setField(term5468, term5468.getClass(), "status", enum12);
        setField(term5553, term5553.getClass(), "comparator", null);
        setField(term5553, term5553.getClass(), "root", null);
        setIntField(term5553, term5553.getClass(), "size", 0);
        setIntField(term5553, term5553.getClass(), "modCount", 0);
        setField(term5553, term5553.getClass(), "entrySet", null);
        setField(term5553, term5553.getClass(), "navigableKeySet", null);
        setField(term5553, term5553.getClass(), "descendingMap", null);
        setField(term5553, term5553.getClass(), "keySet", null);
        setField(term5553, term5553.getClass(), "values", null);
        setField(term5552, term5552.getClass(), "m", term5553);
        setField(term5468, term5468.getClass(), "roles", term5552);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term5468, args);
    }

};


