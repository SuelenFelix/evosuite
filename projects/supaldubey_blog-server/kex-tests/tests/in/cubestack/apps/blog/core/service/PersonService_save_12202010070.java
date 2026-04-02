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

public class PersonService_save_12202010070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1310;

    public PersonService_save_12202010070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1461 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1460 = ((Class) term1461).getDeclaredField((String) "DISABLED");
        ((Field) term1460).setAccessible(true);
        Object enum1 = ((Field) term1460).get((Object) null);
        term1310 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term1396 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1397 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term1310, term1310.getClass(), "id", 6375119433582206027L);
        setField(term1310, term1310.getClass(), "firstName", "hxCBltsObl");
        setField(term1310, term1310.getClass(), "lastName", "BndsHwAFMv");
        setField(term1310, term1310.getClass(), "email", "GzFkzHGYFt");
        setField(term1310, term1310.getClass(), "username", "tShwQLRGNe");
        setField(term1310, term1310.getClass(), "password", "LvtrsXUliU");
        setField(term1310, term1310.getClass(), "phone", "xLbjWUgOIL");
        setField(term1310, term1310.getClass(), "status", enum1);
        setField(term1397, term1397.getClass(), "comparator", null);
        setField(term1397, term1397.getClass(), "root", null);
        setIntField(term1397, term1397.getClass(), "size", 0);
        setIntField(term1397, term1397.getClass(), "modCount", 0);
        setField(term1397, term1397.getClass(), "entrySet", null);
        setField(term1397, term1397.getClass(), "navigableKeySet", null);
        setField(term1397, term1397.getClass(), "descendingMap", null);
        setField(term1397, term1397.getClass(), "keySet", null);
        setField(term1397, term1397.getClass(), "values", null);
        setField(term1396, term1396.getClass(), "m", term1397);
        setField(term1310, term1310.getClass(), "roles", term1396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.service.PersonService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Object[] args = new Object[1];
        args[0] = term1310;
        callMethod(klass, "save", argTypes, null, args);
    }

};


