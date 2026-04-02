package in.cubestack.apps.blog.core.service;

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
import static in.cubestack.apps.blog.core.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class PersonService_update_17229079571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1726;

    public PersonService_update_17229079571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1876 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1875 = ((Class) term1876).getDeclaredField((String) "PENDING");
        ((Field) term1875).setAccessible(true);
        Object enum2 = ((Field) term1875).get((Object) null);
        term1726 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term1811 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1812 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term1726, term1726.getClass(), "id", -8257434502486459194L);
        setField(term1726, term1726.getClass(), "firstName", "jDtqGUpnZN");
        setField(term1726, term1726.getClass(), "lastName", "nGKItKLYNC");
        setField(term1726, term1726.getClass(), "email", "UiUYnPrcCi");
        setField(term1726, term1726.getClass(), "username", "UoYtihxVaS");
        setField(term1726, term1726.getClass(), "password", "JDswTTCZHV");
        setField(term1726, term1726.getClass(), "phone", "onpbIeEKoi");
        setField(term1726, term1726.getClass(), "status", enum2);
        setField(term1812, term1812.getClass(), "comparator", null);
        setField(term1812, term1812.getClass(), "root", null);
        setIntField(term1812, term1812.getClass(), "size", 0);
        setIntField(term1812, term1812.getClass(), "modCount", 0);
        setField(term1812, term1812.getClass(), "entrySet", null);
        setField(term1812, term1812.getClass(), "navigableKeySet", null);
        setField(term1812, term1812.getClass(), "descendingMap", null);
        setField(term1812, term1812.getClass(), "keySet", null);
        setField(term1812, term1812.getClass(), "values", null);
        setField(term1811, term1811.getClass(), "m", term1812);
        setField(term1726, term1726.getClass(), "roles", term1811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.PersonService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Object[] args = new Object[1];
        args[0] = term1726;
        callMethod(klass, "update", argTypes, null, args);
    }

};


