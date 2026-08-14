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

public class ChartIndexInfo_toString_203767781520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75909;

    public ChartIndexInfo_toString_203767781520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75909 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75909, term75909.getClass(), "dataStartRow", 1820784228);
        setIntField(term75909, term75909.getClass(), "dataEndRow", 1390820006);
        setIntField(term75909, term75909.getClass(), "dataStartColumn", -828982065);
        setIntField(term75909, term75909.getClass(), "dataEndColumn", 1221443226);
        setIntField(term75909, term75909.getClass(), "categoryStartRow", 908108726);
        setIntField(term75909, term75909.getClass(), "categoryEndRow", 1023209512);
        setIntField(term75909, term75909.getClass(), "categoryStartColumn", 1084849225);
        setIntField(term75909, term75909.getClass(), "categoryEndColumn", -1702055571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term75909, args);
    }

};


