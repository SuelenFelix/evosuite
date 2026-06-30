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

public class PersonCandidate_setFirstName_1776628146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2504;

    public PersonCandidate_setFirstName_1776628146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2665 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term2664 = ((Class) term2665).getDeclaredField((String) "ACTIVE");
        ((Field) term2664).setAccessible(true);
        Object enum5 = ((Field) term2664).get((Object) null);
        term2504 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term2588 = newInstance(Class.forName("java.util.TreeSet"));
        Object term2589 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term2504, term2504.getClass(), "id", 7411271909051562686L);
        setField(term2504, term2504.getClass(), "firstName", "GzFkzHGYFt");
        setField(term2504, term2504.getClass(), "lastName", "tShwQLRGNe");
        setField(term2504, term2504.getClass(), "email", "LvtrsXUliU");
        setField(term2504, term2504.getClass(), "username", "xLbjWUgOIL");
        setField(term2504, term2504.getClass(), "password", "jDtqGUpnZN");
        setField(term2504, term2504.getClass(), "phone", "nGKItKLYNC");
        setField(term2504, term2504.getClass(), "status", enum5);
        setField(term2589, term2589.getClass(), "comparator", null);
        setField(term2589, term2589.getClass(), "root", null);
        setIntField(term2589, term2589.getClass(), "size", 0);
        setIntField(term2589, term2589.getClass(), "modCount", 0);
        setField(term2589, term2589.getClass(), "entrySet", null);
        setField(term2589, term2589.getClass(), "navigableKeySet", null);
        setField(term2589, term2589.getClass(), "descendingMap", null);
        setField(term2589, term2589.getClass(), "keySet", null);
        setField(term2589, term2589.getClass(), "values", null);
        setField(term2588, term2588.getClass(), "m", term2589);
        setField(term2504, term2504.getClass(), "roles", term2588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UiUYnPrcCi";
        callMethod(klass, "setFirstName", argTypes, term2504, args);
    }

};


