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

public class ChartIndexInfo_hashCode_152691812519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;

    public ChartIndexInfo_hashCode_152691812519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term181, term181.getClass(), "dataStartRow", -1388471422);
        setIntField(term181, term181.getClass(), "dataEndRow", -1498296052);
        setIntField(term181, term181.getClass(), "dataStartColumn", 2098647989);
        setIntField(term181, term181.getClass(), "dataEndColumn", 1598895173);
        setIntField(term181, term181.getClass(), "categoryStartRow", 1830648570);
        setIntField(term181, term181.getClass(), "categoryEndRow", -227365013);
        setIntField(term181, term181.getClass(), "categoryStartColumn", 11724947);
        setIntField(term181, term181.getClass(), "categoryEndColumn", 1953277050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term181, args);
    }

};


