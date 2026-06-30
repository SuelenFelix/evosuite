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

public class PersonCandidate_setStatus_214427511418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7572;
     Object enum18;

    public PersonCandidate_setStatus_214427511418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7733 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term7732 = ((Class) term7733).getDeclaredField((String) "DISABLED");
        ((Field) term7732).setAccessible(true);
        Object enum17 = ((Field) term7732).get((Object) null);
        term7572 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term7658 = newInstance(Class.forName("java.util.TreeSet"));
        Object term7659 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term7572, term7572.getClass(), "id", 5127676408959197577L);
        setField(term7572, term7572.getClass(), "firstName", "XOiDvlDhdc");
        setField(term7572, term7572.getClass(), "lastName", "AdxvLJhNLe");
        setField(term7572, term7572.getClass(), "email", "lHfTrWKMPk");
        setField(term7572, term7572.getClass(), "username", "JDaAnsVTGV");
        setField(term7572, term7572.getClass(), "password", "mLUZFTfjle");
        setField(term7572, term7572.getClass(), "phone", "xIeFjkHkOe");
        setField(term7572, term7572.getClass(), "status", enum17);
        setField(term7659, term7659.getClass(), "comparator", null);
        setField(term7659, term7659.getClass(), "root", null);
        setIntField(term7659, term7659.getClass(), "size", 0);
        setIntField(term7659, term7659.getClass(), "modCount", 0);
        setField(term7659, term7659.getClass(), "entrySet", null);
        setField(term7659, term7659.getClass(), "navigableKeySet", null);
        setField(term7659, term7659.getClass(), "descendingMap", null);
        setField(term7659, term7659.getClass(), "keySet", null);
        setField(term7659, term7659.getClass(), "values", null);
        setField(term7658, term7658.getClass(), "m", term7659);
        setField(term7572, term7572.getClass(), "roles", term7658);
        Class<? extends Object> term7999 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term7998 = ((Class) term7999).getDeclaredField((String) "ACTIVE");
        ((Field) term7998).setAccessible(true);
        enum18 = ((Field) term7998).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("in.cubestack.apps.blog.core.domain.PersonStatus");
        Object[] args = new Object[1];
        args[0] = enum18;
        callMethod(klass, "setStatus", argTypes, term7572, args);
    }

};


