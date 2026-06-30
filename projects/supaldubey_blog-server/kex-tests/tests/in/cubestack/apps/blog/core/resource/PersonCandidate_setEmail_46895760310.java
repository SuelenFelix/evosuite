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

public class PersonCandidate_setEmail_46895760310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4192;

    public PersonCandidate_setEmail_46895760310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4353 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term4352 = ((Class) term4353).getDeclaredField((String) "ACTIVE");
        ((Field) term4352).setAccessible(true);
        Object enum9 = ((Field) term4352).get((Object) null);
        term4192 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term4276 = newInstance(Class.forName("java.util.TreeSet"));
        Object term4277 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term4192, term4192.getClass(), "id", 6967924379644551255L);
        setField(term4192, term4192.getClass(), "firstName", "IgRJUzaCwW");
        setField(term4192, term4192.getClass(), "lastName", "JUmudUmaaV");
        setField(term4192, term4192.getClass(), "email", "KoyGrUJeJW");
        setField(term4192, term4192.getClass(), "username", "HqBOwkVqjD");
        setField(term4192, term4192.getClass(), "password", "MAcUBcBckh");
        setField(term4192, term4192.getClass(), "phone", "oVgzLbrsFr");
        setField(term4192, term4192.getClass(), "status", enum9);
        setField(term4277, term4277.getClass(), "comparator", null);
        setField(term4277, term4277.getClass(), "root", null);
        setIntField(term4277, term4277.getClass(), "size", 0);
        setIntField(term4277, term4277.getClass(), "modCount", 0);
        setField(term4277, term4277.getClass(), "entrySet", null);
        setField(term4277, term4277.getClass(), "navigableKeySet", null);
        setField(term4277, term4277.getClass(), "descendingMap", null);
        setField(term4277, term4277.getClass(), "keySet", null);
        setField(term4277, term4277.getClass(), "values", null);
        setField(term4276, term4276.getClass(), "m", term4277);
        setField(term4192, term4192.getClass(), "roles", term4276);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vQVyKLdtaz";
        callMethod(klass, "setEmail", argTypes, term4192, args);
    }

};


