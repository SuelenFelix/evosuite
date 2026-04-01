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

public class Course_getScore_18768723822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27948;

    public Course_getScore_18768723822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27948 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term27948, term27948.getClass(), "score", 0.544608645520025);
        setField(term27948, term27948.getClass(), "code", "dEnhdmILtU");
        setField(term27948, term27948.getClass(), "name", "hoicvmsovO");
        setField(term27948, term27948.getClass(), "year", "eqJfYWRaEL");
        setField(term27948, term27948.getClass(), "semester", "fhkbdRViHi");
        setField(term27948, term27948.getClass(), "lecturer", "uWHnvSvaPl");
        setBooleanField(term27948, term27948.getClass(), "isLecturerEditable", true);
        setField(term27948, term27948.getClass(), "campus", "kBdSllIBVz");
        setField(term27948, term27948.getClass(), "room", "TJmVBGfTML");
        setField(term27948, term27948.getClass(), "day", "tPlsykYBqO");
        setField(term27948, term27948.getClass(), "time", "bLPjGVBhlX");
        setField(term27948, term27948.getClass(), "requirement", "whBvTVIIlC");
        setIntField(term27948, term27948.getClass(), "creditHours", 1107176718);
        setBooleanField(term27948, term27948.getClass(), "isConfirmed", false);
        setField(term27948, term27948.getClass(), "status", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term27948, args);
    }

};


