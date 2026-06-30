package com.maciejwalkowiak.paseq;

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
import static com.maciejwalkowiak.paseq.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TaskBuilder_build_2950367225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617;

    public TaskBuilder_build_2950367225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617 = newInstance(Class.forName("com.maciejwalkowiak.paseq.TaskBuilder"));
        Object[] term620 = (Object[]) newArray("java.lang.String", 6);
        Object term693 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term617, term617.getClass(), "async", false);
        setBooleanField(term617, term617.getClass(), "wait", true);
        setElement(term620, 0, "OclPbYPkcH");
        setElement(term620, 1, "IoAlmYsBwc");
        setElement(term620, 2, "TEParAifyi");
        setElement(term620, 3, "OWDIEULEFu");
        setElement(term620, 4, "dWRymuLBtr");
        setElement(term620, 5, "AijpHYOFuy");
        setField(term617, term617.getClass(), "goals", term620);
        setField(term693, term693.getClass(), "command", "SbAoxhfrkn");
        setField(term693, term693.getClass(), "directory", "kuTXqwMtDB");
        setField(term617, term617.getClass(), "exec", term693);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.TaskBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term617, args);
    }

};


