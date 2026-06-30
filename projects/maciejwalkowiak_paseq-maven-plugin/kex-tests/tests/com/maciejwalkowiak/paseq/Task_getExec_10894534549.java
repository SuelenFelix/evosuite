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

public class Task_getExec_10894534549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1992;

    public Task_getExec_10894534549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1992 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Task"));
        Object[] term1995 = (Object[]) newArray("java.lang.String", 5);
        Object term2056 = newInstance(Class.forName("com.maciejwalkowiak.paseq.Exec"));
        setBooleanField(term1992, term1992.getClass(), "async", true);
        setBooleanField(term1992, term1992.getClass(), "wait", true);
        setElement(term1995, 0, "TimdotUuNC");
        setElement(term1995, 1, "PkWMRdJcBb");
        setElement(term1995, 2, "jSpAteRute");
        setElement(term1995, 3, "swZVeJAxjt");
        setElement(term1995, 4, "xOcJIiQQDu");
        setField(term1992, term1992.getClass(), "goals", term1995);
        setField(term2056, term2056.getClass(), "command", "GVizqqzXpy");
        setField(term2056, term2056.getClass(), "directory", "JqXGgAhZPl");
        setField(term1992, term1992.getClass(), "exec", term2056);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.maciejwalkowiak.paseq.Task");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExec", argTypes, term1992, args);
    }

};


