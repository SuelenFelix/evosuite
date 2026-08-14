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
     Object term75900;

    public ChartIndexInfo_hashCode_152691812519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75900 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75900, term75900.getClass(), "dataStartRow", 1146601902);
        setIntField(term75900, term75900.getClass(), "dataEndRow", -1938881385);
        setIntField(term75900, term75900.getClass(), "dataStartColumn", -1629418973);
        setIntField(term75900, term75900.getClass(), "dataEndColumn", -100825168);
        setIntField(term75900, term75900.getClass(), "categoryStartRow", 768407648);
        setIntField(term75900, term75900.getClass(), "categoryEndRow", -350454594);
        setIntField(term75900, term75900.getClass(), "categoryStartColumn", -1148142995);
        setIntField(term75900, term75900.getClass(), "categoryEndColumn", -233024044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term75900, args);
    }

};


