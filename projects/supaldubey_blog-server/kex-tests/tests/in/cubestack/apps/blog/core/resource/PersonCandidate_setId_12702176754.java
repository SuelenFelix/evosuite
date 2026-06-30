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
import java.lang.Long;

public class PersonCandidate_setId_12702176754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1674;
     Object term1764;

    public PersonCandidate_setId_12702176754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1827 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term1826 = ((Class) term1827).getDeclaredField((String) "DISABLED");
        ((Field) term1826).setAccessible(true);
        Object enum3 = ((Field) term1826).get((Object) null);
        term1674 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term1760 = newInstance(Class.forName("java.util.TreeSet"));
        Object term1761 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term1674, term1674.getClass(), "id", -8257434502486459194L);
        setField(term1674, term1674.getClass(), "firstName", "SbAoxhfrkn");
        setField(term1674, term1674.getClass(), "lastName", "kuTXqwMtDB");
        setField(term1674, term1674.getClass(), "email", "Ghbwtircqb");
        setField(term1674, term1674.getClass(), "username", "xrwlQZdwCp");
        setField(term1674, term1674.getClass(), "password", "IDCWpPLRkE");
        setField(term1674, term1674.getClass(), "phone", "nyiiPDVjAc");
        setField(term1674, term1674.getClass(), "status", enum3);
        setField(term1761, term1761.getClass(), "comparator", null);
        setField(term1761, term1761.getClass(), "root", null);
        setIntField(term1761, term1761.getClass(), "size", 0);
        setIntField(term1761, term1761.getClass(), "modCount", 0);
        setField(term1761, term1761.getClass(), "entrySet", null);
        setField(term1761, term1761.getClass(), "navigableKeySet", null);
        setField(term1761, term1761.getClass(), "descendingMap", null);
        setField(term1761, term1761.getClass(), "keySet", null);
        setField(term1761, term1761.getClass(), "values", null);
        setField(term1760, term1760.getClass(), "m", term1761);
        setField(term1674, term1674.getClass(), "roles", term1760);
        term1764 = new Long(-8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term1764;
        callMethod(klass, "setId", argTypes, term1674, args);
    }

};


