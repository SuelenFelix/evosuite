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

public class PersonCandidate_test_15916096981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;

    public PersonCandidate_test_15916096981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term502 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term501 = ((Class) term502).getDeclaredField((String) "DISABLED");
        ((Field) term501).setAccessible(true);
        Object enum0 = ((Field) term501).get((Object) null);
        term318 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term404 = newInstance(Class.forName("java.util.TreeSet"));
        Object term405 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term318, term318.getClass(), "id", 2442117782898005296L);
        setField(term318, term318.getClass(), "firstName", "MxlszYVzRf");
        setField(term318, term318.getClass(), "lastName", "LQFpaHEwXR");
        setField(term318, term318.getClass(), "email", "oVcInYnLWB");
        setField(term318, term318.getClass(), "username", "aJlieCFVtF");
        setField(term318, term318.getClass(), "password", "ZiaGIbnzTs");
        setField(term318, term318.getClass(), "phone", "tbcdzjIfER");
        setField(term318, term318.getClass(), "status", enum0);
        setField(term405, term405.getClass(), "comparator", null);
        setField(term405, term405.getClass(), "root", null);
        setIntField(term405, term405.getClass(), "size", 0);
        setIntField(term405, term405.getClass(), "modCount", 0);
        setField(term405, term405.getClass(), "entrySet", null);
        setField(term405, term405.getClass(), "navigableKeySet", null);
        setField(term405, term405.getClass(), "descendingMap", null);
        setField(term405, term405.getClass(), "keySet", null);
        setField(term405, term405.getClass(), "values", null);
        setField(term404, term404.getClass(), "m", term405);
        setField(term318, term318.getClass(), "roles", term404);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "test", argTypes, term318, args);
    }

};


