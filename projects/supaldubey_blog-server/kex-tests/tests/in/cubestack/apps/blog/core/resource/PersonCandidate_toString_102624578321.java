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

public class PersonCandidate_toString_102624578321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9113;

    public PersonCandidate_toString_102624578321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9264 = Class.forName((String) "in.cubestack.apps.blog.core.domain.PersonStatus");
        Field term9263 = ((Class) term9264).getDeclaredField((String) "DISABLED");
        ((Field) term9263).setAccessible(true);
        Object enum21 = ((Field) term9263).get((Object) null);
        term9113 = newInstance(Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate"));
        Object term9199 = newInstance(Class.forName("java.util.TreeSet"));
        Object term9200 = newInstance(Class.forName("java.util.TreeMap"));
        setLongField(term9113, term9113.getClass(), "id", 8428634514691209827L);
        setField(term9113, term9113.getClass(), "firstName", "UfQtPRyWRC");
        setField(term9113, term9113.getClass(), "lastName", "FPvxVzzSvD");
        setField(term9113, term9113.getClass(), "email", "WHcwFgsGFC");
        setField(term9113, term9113.getClass(), "username", "HzqpegHiRq");
        setField(term9113, term9113.getClass(), "password", "jwsfVjMoJT");
        setField(term9113, term9113.getClass(), "phone", "ZfdXfCCFDf");
        setField(term9113, term9113.getClass(), "status", enum21);
        setField(term9200, term9200.getClass(), "comparator", null);
        setField(term9200, term9200.getClass(), "root", null);
        setIntField(term9200, term9200.getClass(), "size", 0);
        setIntField(term9200, term9200.getClass(), "modCount", 0);
        setField(term9200, term9200.getClass(), "entrySet", null);
        setField(term9200, term9200.getClass(), "navigableKeySet", null);
        setField(term9200, term9200.getClass(), "descendingMap", null);
        setField(term9200, term9200.getClass(), "keySet", null);
        setField(term9200, term9200.getClass(), "values", null);
        setField(term9199, term9199.getClass(), "m", term9200);
        setField(term9113, term9113.getClass(), "roles", term9199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("in.cubestack.apps.blog.core.resource.PersonCandidate");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9113, args);
    }

};


