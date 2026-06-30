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

public class PersonCandidate_setUsername_195710492912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5030;

    public PersonCandidate_setUsername_195710492912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5193 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term5192 = ((Class) term5193).getDeclaredField((String) "DISABLED");
        ((Field) term5192).setAccessible(true);
        Object enum11 = ((Field) term5192).get((Object) null);
        term5030 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term5116 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5117 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term5030, term5030.getClass(), "id", -8885298608300233488L);
        setField(term5030, term5030.getClass(), "firstName", "cAPeiZHKGJ");
        setField(term5030, term5030.getClass(), "lastName", "LvJFtLBaxj");
        setField(term5030, term5030.getClass(), "email", "PHvxnGHptP");
        setField(term5030, term5030.getClass(), "username", "TimdotUuNC");
        setField(term5030, term5030.getClass(), "password", "PkWMRdJcBb");
        setField(term5030, term5030.getClass(), "phone", "jSpAteRute");
        setField(term5030, term5030.getClass(), "status", enum11);
        setField(term5117, term5117.getClass(), "comparator", null);
        setField(term5117, term5117.getClass(), "root", null);
        setIntField(term5117, term5117.getClass(), "size", 0);
        setIntField(term5117, term5117.getClass(), "modCount", 0);
        setField(term5117, term5117.getClass(), "entrySet", null);
        setField(term5117, term5117.getClass(), "navigableKeySet", null);
        setField(term5117, term5117.getClass(), "descendingMap", null);
        setField(term5117, term5117.getClass(), "keySet", null);
        setField(term5117, term5117.getClass(), "values", null);
        setField(term5116, term5116.getClass(), "m", term5117);
        setField(term5030, term5030.getClass(), "roles", term5116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "swZVeJAxjt";
        callMethod(klass, "setUsername", argTypes, term5030, args);
    }

};


