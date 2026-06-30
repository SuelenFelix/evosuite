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

public class ChartIndexInfo_getCategoryStartRow_4579482605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;

    public ChartIndexInfo_getCategoryStartRow_4579482605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term37, term37.getClass(), "dataStartRow", -73683645);
        setIntField(term37, term37.getClass(), "dataEndRow", -226514366);
        setIntField(term37, term37.getClass(), "dataStartColumn", 1193880199);
        setIntField(term37, term37.getClass(), "dataEndColumn", -1087774327);
        setIntField(term37, term37.getClass(), "categoryStartRow", -1530420153);
        setIntField(term37, term37.getClass(), "categoryEndRow", -469968304);
        setIntField(term37, term37.getClass(), "categoryStartColumn", -1145578966);
        setIntField(term37, term37.getClass(), "categoryEndColumn", 679763016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryStartRow", argTypes, term37, args);
    }

};


