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

public class ChartIndexInfo_getDataEndRow_13573073372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;

    public ChartIndexInfo_getDataEndRow_13573073372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term10, term10.getClass(), "dataStartRow", 1227103734);
        setIntField(term10, term10.getClass(), "dataEndRow", -1339778481);
        setIntField(term10, term10.getClass(), "dataStartColumn", 1725571209);
        setIntField(term10, term10.getClass(), "dataEndColumn", -522618178);
        setIntField(term10, term10.getClass(), "categoryStartRow", 1134449235);
        setIntField(term10, term10.getClass(), "categoryEndRow", -883034806);
        setIntField(term10, term10.getClass(), "categoryStartColumn", 1585847225);
        setIntField(term10, term10.getClass(), "categoryEndColumn", 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataEndRow", argTypes, term10, args);
    }

};


