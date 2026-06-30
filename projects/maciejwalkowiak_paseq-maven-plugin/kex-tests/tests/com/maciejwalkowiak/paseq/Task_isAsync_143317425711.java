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

public class Task_isAsync_143317425711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2244;

    public Task_isAsync_143317425711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2244 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term2247 = (Object[]) newArray("java.lang.String", 3);
        Object term2284 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term2244, term2244.getClass(), "async", true);
        setBooleanField(term2244, term2244.getClass(), "wait", false);
        setElement(term2247, 0, "XPKmummaqg");
        setElement(term2247, 1, "BKLfkLiZTH");
        setElement(term2247, 2, "SPpkrGcPRr");
        setField(term2244, term2244.getClass(), "goals", term2247);
        setField(term2284, term2284.getClass(), "command", "sEccwbJKYE");
        setField(term2284, term2284.getClass(), "directory", "AWRooQKkdW");
        setField(term2244, term2244.getClass(), "exec", term2284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAsync", argTypes, term2244, args);
    }

};


