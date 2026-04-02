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

public class PersonCandidate_setPhone_151148926916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6722;

    public PersonCandidate_setPhone_151148926916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6884 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term6883 = ((Class) term6884).getDeclaredField((String) "PENDING");
        ((Field) term6883).setAccessible(true);
        Object enum15 = ((Field) term6883).get((Object) null);
        term6722 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term6807 = newInstance(Class.forName("java.util.TreeSet"));
        Object term6808 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term6722, term6722.getClass(), "id", -872011222785455006L);
        setField(term6722, term6722.getClass(), "firstName", "eVpkWxjuki");
        setField(term6722, term6722.getClass(), "lastName", "SJiQaLvSKv");
        setField(term6722, term6722.getClass(), "email", "OEXDRUKcFl");
        setField(term6722, term6722.getClass(), "username", "RYdKCNNMBR");
        setField(term6722, term6722.getClass(), "password", "yGtHPyvYiQ");
        setField(term6722, term6722.getClass(), "phone", "MvRIxilFMJ");
        setField(term6722, term6722.getClass(), "status", enum15);
        setField(term6808, term6808.getClass(), "comparator", null);
        setField(term6808, term6808.getClass(), "root", null);
        setIntField(term6808, term6808.getClass(), "size", 0);
        setIntField(term6808, term6808.getClass(), "modCount", 0);
        setField(term6808, term6808.getClass(), "entrySet", null);
        setField(term6808, term6808.getClass(), "navigableKeySet", null);
        setField(term6808, term6808.getClass(), "descendingMap", null);
        setField(term6808, term6808.getClass(), "keySet", null);
        setField(term6808, term6808.getClass(), "values", null);
        setField(term6807, term6807.getClass(), "m", term6808);
        setField(term6722, term6722.getClass(), "roles", term6807);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "iNwOJRBEjp";
        callMethod(klass, "setPhone", argTypes, term6722, args);
    }

};


