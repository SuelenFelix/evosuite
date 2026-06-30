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

public class PersonCandidate_getLastName_13200409727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2934;

    public PersonCandidate_getLastName_13200409727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3085 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term3084 = ((Class) term3085).getDeclaredField((String) "DISABLED");
        ((Field) term3084).setAccessible(true);
        Object enum6 = ((Field) term3084).get((Object) null);
        term2934 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term3020 = newInstance(Class.forName("java.util.TreeSet"));
        Object term3021 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term2934, term2934.getClass(), "id", 4872422362414183754L);
        setField(term2934, term2934.getClass(), "firstName", "UoYtihxVaS");
        setField(term2934, term2934.getClass(), "lastName", "JDswTTCZHV");
        setField(term2934, term2934.getClass(), "email", "onpbIeEKoi");
        setField(term2934, term2934.getClass(), "username", "YRHGsAkhxb");
        setField(term2934, term2934.getClass(), "password", "ffYhPOzlUs");
        setField(term2934, term2934.getClass(), "phone", "MLqYREekMl");
        setField(term2934, term2934.getClass(), "status", enum6);
        setField(term3021, term3021.getClass(), "comparator", null);
        setField(term3021, term3021.getClass(), "root", null);
        setIntField(term3021, term3021.getClass(), "size", 0);
        setIntField(term3021, term3021.getClass(), "modCount", 0);
        setField(term3021, term3021.getClass(), "entrySet", null);
        setField(term3021, term3021.getClass(), "navigableKeySet", null);
        setField(term3021, term3021.getClass(), "descendingMap", null);
        setField(term3021, term3021.getClass(), "keySet", null);
        setField(term3021, term3021.getClass(), "values", null);
        setField(term3020, term3020.getClass(), "m", term3021);
        setField(term2934, term2934.getClass(), "roles", term3020);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastName", argTypes, term2934, args);
    }

};


