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

public class PersonCandidate_setPassword_90189866214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5876;

    public PersonCandidate_setPassword_90189866214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6039 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term6038 = ((Class) term6039).getDeclaredField((String) "DISABLED");
        ((Field) term6038).setAccessible(true);
        Object enum13 = ((Field) term6038).get((Object) null);
        term5876 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term5962 = newInstance(Class.forName("java.util.TreeSet"));
        Object term5963 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term5876, term5876.getClass(), "id", 2535595959091595249L);
        setField(term5876, term5876.getClass(), "firstName", "JiVRgTZvKc");
        setField(term5876, term5876.getClass(), "lastName", "XPKmummaqg");
        setField(term5876, term5876.getClass(), "email", "BKLfkLiZTH");
        setField(term5876, term5876.getClass(), "username", "SPpkrGcPRr");
        setField(term5876, term5876.getClass(), "password", "sEccwbJKYE");
        setField(term5876, term5876.getClass(), "phone", "AWRooQKkdW");
        setField(term5876, term5876.getClass(), "status", enum13);
        setField(term5963, term5963.getClass(), "comparator", null);
        setField(term5963, term5963.getClass(), "root", null);
        setIntField(term5963, term5963.getClass(), "size", 0);
        setIntField(term5963, term5963.getClass(), "modCount", 0);
        setField(term5963, term5963.getClass(), "entrySet", null);
        setField(term5963, term5963.getClass(), "navigableKeySet", null);
        setField(term5963, term5963.getClass(), "descendingMap", null);
        setField(term5963, term5963.getClass(), "keySet", null);
        setField(term5963, term5963.getClass(), "values", null);
        setField(term5962, term5962.getClass(), "m", term5963);
        setField(term5876, term5876.getClass(), "roles", term5962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vjxIhXHxGR";
        callMethod(klass, "setPassword", argTypes, term5876, args);
    }

};


