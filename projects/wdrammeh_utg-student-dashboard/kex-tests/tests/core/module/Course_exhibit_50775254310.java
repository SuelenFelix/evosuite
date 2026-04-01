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

public class Course_exhibit_50775254310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29701;

    public Course_exhibit_50775254310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29701 = newInstance(Class.forName("core.module.Course"));
        setDoubleField(term29701, term29701.getClass(), "score", 0.5183269973490326);
        setField(term29701, term29701.getClass(), "code", "ZzIujlwVsw");
        setField(term29701, term29701.getClass(), "name", "LWyEaeIyAo");
        setField(term29701, term29701.getClass(), "year", "yVMkkQhvmN");
        setField(term29701, term29701.getClass(), "semester", "mvrkADEgpp");
        setField(term29701, term29701.getClass(), "lecturer", "pXOkjyeIRb");
        setBooleanField(term29701, term29701.getClass(), "isLecturerEditable", true);
        setField(term29701, term29701.getClass(), "campus", "GgZWSjxjyE");
        setField(term29701, term29701.getClass(), "room", "EeBVbzjcCI");
        setField(term29701, term29701.getClass(), "day", "UfQtPRyWRC");
        setField(term29701, term29701.getClass(), "time", "FPvxVzzSvD");
        setField(term29701, term29701.getClass(), "requirement", "WHcwFgsGFC");
        setIntField(term29701, term29701.getClass(), "creditHours", 107945604);
        setBooleanField(term29701, term29701.getClass(), "isConfirmed", false);
        setField(term29701, term29701.getClass(), "status", "HzqpegHiRq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("core.module.Course");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Component");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "exhibit", argTypes, term29701, args);
    }

};


