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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class PersonCandidate_setRoles_78840188120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8666;
     Object term8756;

    public PersonCandidate_setRoles_78840188120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8850 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term8849 = ((Class) term8850).getDeclaredField((String) "DISABLED");
        ((Field) term8849).setAccessible(true);
        Object enum20 = ((Field) term8849).get((Object) null);
        term8666 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term8752 = newInstance(Class.forName("java.util.TreeSet"));
        Object term8753 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term8666, term8666.getClass(), "id", -4920224193275732920L);
        setField(term8666, term8666.getClass(), "firstName", "fWKJoSoCwE");
        setField(term8666, term8666.getClass(), "lastName", "wfaXBpWAUH");
        setField(term8666, term8666.getClass(), "email", "VMeAzAHwZj");
        setField(term8666, term8666.getClass(), "username", "PznxWXsZME");
        setField(term8666, term8666.getClass(), "password", "ZzIujlwVsw");
        setField(term8666, term8666.getClass(), "phone", "LWyEaeIyAo");
        setField(term8666, term8666.getClass(), "status", enum20);
        setField(term8753, term8753.getClass(), "comparator", null);
        setField(term8753, term8753.getClass(), "root", null);
        setIntField(term8753, term8753.getClass(), "size", 0);
        setIntField(term8753, term8753.getClass(), "modCount", 0);
        setField(term8753, term8753.getClass(), "entrySet", null);
        setField(term8753, term8753.getClass(), "navigableKeySet", null);
        setField(term8753, term8753.getClass(), "descendingMap", null);
        setField(term8753, term8753.getClass(), "keySet", null);
        setField(term8753, term8753.getClass(), "values", null);
        setField(term8752, term8752.getClass(), "m", term8753);
        setField(term8666, term8666.getClass(), "roles", term8752);
        HashMap term8757 = new HashMap();
        Set<Object> term9115 =  ((Map) term8757).keySet();
        term8756 = new HashSet((Collection<? extends Object>) term9115);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term8756;
        callMethod(klass, "setRoles", argTypes, term8666, args);
    }

};


