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
import java.lang.Double;

public class Course_setScore_160170345012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29953;
     Object term29958;

    public Course_setScore_160170345012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29953 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29953, term29953.getClass(), "score", 0.0);
        setField(term29953, term29953.getClass(), "code", null);
        setField(term29953, term29953.getClass(), "name", null);
        setField(term29953, term29953.getClass(), "year", null);
        setField(term29953, term29953.getClass(), "semester", null);
        setField(term29953, term29953.getClass(), "lecturer", null);
        setBooleanField(term29953, term29953.getClass(), "isLecturerEditable", false);
        setField(term29953, term29953.getClass(), "campus", null);
        setField(term29953, term29953.getClass(), "room", null);
        setField(term29953, term29953.getClass(), "day", null);
        setField(term29953, term29953.getClass(), "time", null);
        setField(term29953, term29953.getClass(), "requirement", null);
        setIntField(term29953, term29953.getClass(), "creditHours", 0);
        setBooleanField(term29953, term29953.getClass(), "isConfirmed", false);
        setField(term29953, term29953.getClass(), "status", null);
        term29958 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term29958;
        callMethod(klass, "setScore", argTypes, term29953, args);
    }

};


