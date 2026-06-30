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

public class PersonCandidate_getUsername_75151992711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4622;

    public PersonCandidate_getUsername_75151992711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4771 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term4770 = ((Class) term4771).getDeclaredField((String) "ACTIVE");
        ((Field) term4770).setAccessible(true);
        Object enum10 = ((Field) term4770).get((Object) null);
        term4622 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term4706 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4707 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term4622, term4622.getClass(), "id", -2813493605142626659L);
        setField(term4622, term4622.getClass(), "firstName", "OWKQODBLzb");
        setField(term4622, term4622.getClass(), "lastName", "wGmYcqUkgE");
        setField(term4622, term4622.getClass(), "email", "idgaQsnJpQ");
        setField(term4622, term4622.getClass(), "username", "VgZnGoIFwQ");
        setField(term4622, term4622.getClass(), "password", "jUbSRrkrYZ");
        setField(term4622, term4622.getClass(), "phone", "bWWfajKbEX");
        setField(term4622, term4622.getClass(), "status", enum10);
        setField(term4707, term4707.getClass(), "comparator", null);
        setField(term4707, term4707.getClass(), "root", null);
        setIntField(term4707, term4707.getClass(), "size", 0);
        setIntField(term4707, term4707.getClass(), "modCount", 0);
        setField(term4707, term4707.getClass(), "entrySet", null);
        setField(term4707, term4707.getClass(), "navigableKeySet", null);
        setField(term4707, term4707.getClass(), "descendingMap", null);
        setField(term4707, term4707.getClass(), "keySet", null);
        setField(term4707, term4707.getClass(), "values", null);
        setField(term4706, term4706.getClass(), "m", term4707);
        setField(term4622, term4622.getClass(), "roles", term4706);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term4622, args);
    }

};


