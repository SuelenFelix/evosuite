package com.projectsample.libapachepoi.playground.temp;

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
import static com.projectsample.libapachepoi.playground.temp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ChartIndexInfo_equals_107823145017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75880;
     Object term75889;

    public ChartIndexInfo_equals_107823145017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75880 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75880, term75880.getClass(), "dataStartRow", -1813280137);
        setIntField(term75880, term75880.getClass(), "dataEndRow", 719656595);
        setIntField(term75880, term75880.getClass(), "dataStartColumn", -1516995753);
        setIntField(term75880, term75880.getClass(), "dataEndColumn", -390501023);
        setIntField(term75880, term75880.getClass(), "categoryStartRow", -1667482829);
        setIntField(term75880, term75880.getClass(), "categoryEndRow", 1116576792);
        setIntField(term75880, term75880.getClass(), "categoryStartColumn", -942194446);
        setIntField(term75880, term75880.getClass(), "categoryEndColumn", -938508470);
        term75889 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75889;
        callMethod(klass, "equals", argTypes, term75880, args);
    }

};


