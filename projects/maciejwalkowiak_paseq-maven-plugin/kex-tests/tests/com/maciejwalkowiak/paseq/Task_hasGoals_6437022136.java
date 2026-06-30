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

public class Task_hasGoals_6437022136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1581;

    public Task_hasGoals_6437022136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1581 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term1584 = (Object[]) newArray("java.lang.String", 1);
        Object term1597 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1581, term1581.getClass(), "async", false);
        setBooleanField(term1581, term1581.getClass(), "wait", false);
        setElement(term1584, 0, "bLPjGVBhlX");
        setField(term1581, term1581.getClass(), "goals", term1584);
        setField(term1597, term1597.getClass(), "command", "whBvTVIIlC");
        setField(term1597, term1597.getClass(), "directory", "IgRJUzaCwW");
        setField(term1581, term1581.getClass(), "exec", term1597);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasGoals", argTypes, term1581, args);
    }

};


