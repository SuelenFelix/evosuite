package core.module;

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
import static core.module.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Course_getScore_187687238211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29948;

    public Course_getScore_187687238211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29948 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29948, term29948.getClass(), "score", 0.0);
        setField(term29948, term29948.getClass(), "code", null);
        setField(term29948, term29948.getClass(), "name", null);
        setField(term29948, term29948.getClass(), "year", null);
        setField(term29948, term29948.getClass(), "semester", null);
        setField(term29948, term29948.getClass(), "lecturer", null);
        setBooleanField(term29948, term29948.getClass(), "isLecturerEditable", false);
        setField(term29948, term29948.getClass(), "campus", null);
        setField(term29948, term29948.getClass(), "room", null);
        setField(term29948, term29948.getClass(), "day", null);
        setField(term29948, term29948.getClass(), "time", null);
        setField(term29948, term29948.getClass(), "requirement", null);
        setIntField(term29948, term29948.getClass(), "creditHours", 0);
        setBooleanField(term29948, term29948.getClass(), "isConfirmed", false);
        setField(term29948, term29948.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term29948, args);
    }

};


