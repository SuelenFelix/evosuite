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

public class PersonCandidate_getPhone_193515768515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6314;

    public PersonCandidate_getPhone_193515768515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6463 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term6462 = ((Class) term6463).getDeclaredField((String) "ACTIVE");
        ((Field) term6462).setAccessible(true);
        Object enum14 = ((Field) term6462).get((Object) null);
        term6314 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term6398 = newInstance(Class.forName("java.util.TreeSet"));
        Object term6399 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term6314, term6314.getClass(), "id", -5476826692763582090L);
        setField(term6314, term6314.getClass(), "firstName", "QXzGXbEXMu");
        setField(term6314, term6314.getClass(), "lastName", "qxSDVejjiY");
        setField(term6314, term6314.getClass(), "email", "xBsXSDjXYK");
        setField(term6314, term6314.getClass(), "username", "sEnIVFtZuQ");
        setField(term6314, term6314.getClass(), "password", "ZVecLZMLHF");
        setField(term6314, term6314.getClass(), "phone", "fztQhjqwdP");
        setField(term6314, term6314.getClass(), "status", enum14);
        setField(term6399, term6399.getClass(), "comparator", null);
        setField(term6399, term6399.getClass(), "root", null);
        setIntField(term6399, term6399.getClass(), "size", 0);
        setIntField(term6399, term6399.getClass(), "modCount", 0);
        setField(term6399, term6399.getClass(), "entrySet", null);
        setField(term6399, term6399.getClass(), "navigableKeySet", null);
        setField(term6399, term6399.getClass(), "descendingMap", null);
        setField(term6399, term6399.getClass(), "keySet", null);
        setField(term6399, term6399.getClass(), "values", null);
        setField(term6398, term6398.getClass(), "m", term6399);
        setField(term6314, term6314.getClass(), "roles", term6398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPhone", argTypes, term6314, args);
    }

};


