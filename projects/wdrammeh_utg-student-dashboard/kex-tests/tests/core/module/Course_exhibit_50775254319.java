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

public class Course_exhibit_50775254319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29990;

    public Course_exhibit_50775254319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29990 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29990, term29990.getClass(), "score", 0.0);
        setField(term29990, term29990.getClass(), "code", null);
        setField(term29990, term29990.getClass(), "name", null);
        setField(term29990, term29990.getClass(), "year", null);
        setField(term29990, term29990.getClass(), "semester", null);
        setField(term29990, term29990.getClass(), "lecturer", null);
        setBooleanField(term29990, term29990.getClass(), "isLecturerEditable", false);
        setField(term29990, term29990.getClass(), "campus", null);
        setField(term29990, term29990.getClass(), "room", null);
        setField(term29990, term29990.getClass(), "day", null);
        setField(term29990, term29990.getClass(), "time", null);
        setField(term29990, term29990.getClass(), "requirement", null);
        setIntField(term29990, term29990.getClass(), "creditHours", 0);
        setBooleanField(term29990, term29990.getClass(), "isConfirmed", false);
        setField(term29990, term29990.getClass(), "status", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exhibit", argTypes, term29990, args);
    }

};


