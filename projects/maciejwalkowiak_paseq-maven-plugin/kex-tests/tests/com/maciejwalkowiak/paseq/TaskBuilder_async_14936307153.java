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

public class TaskBuilder_async_14936307153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;

    public TaskBuilder_async_14936307153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("com.maciejwalkowiak.paseq.TaskBuilder"));
        Object[] term412 = (Object[]) newArray("java.lang.String", 4);
        Object term461 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term409, term409.getClass(), "async", true);
        setBooleanField(term409, term409.getClass(), "wait", true);
        setElement(term412, 0, "HyxfbSQYBe");
        setElement(term412, 1, "pCTimMblYc");
        setElement(term412, 2, "hNxWaHcfhY");
        setElement(term412, 3, "RkybSrpybU");
        setField(term409, term409.getClass(), "goals", term412);
        setField(term461, term461.getClass(), "command", "xOEqzGAmDU");
        setField(term461, term461.getClass(), "directory", "eZFUvlxvGV");
        setField(term409, term409.getClass(), "exec", term461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.TaskBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "async", argTypes, term409, args);
    }

};


