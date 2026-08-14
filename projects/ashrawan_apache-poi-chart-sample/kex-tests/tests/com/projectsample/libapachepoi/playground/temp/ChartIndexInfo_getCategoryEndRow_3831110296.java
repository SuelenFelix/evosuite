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

public class ChartIndexInfo_getCategoryEndRow_3831110296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75765;

    public ChartIndexInfo_getCategoryEndRow_3831110296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75765 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75765, term75765.getClass(), "dataStartRow", 2058711405);
        setIntField(term75765, term75765.getClass(), "dataEndRow", 1743683601);
        setIntField(term75765, term75765.getClass(), "dataStartColumn", -945116798);
        setIntField(term75765, term75765.getClass(), "dataEndColumn", 1593461795);
        setIntField(term75765, term75765.getClass(), "categoryStartRow", 515182546);
        setIntField(term75765, term75765.getClass(), "categoryEndRow", -936895502);
        setIntField(term75765, term75765.getClass(), "categoryStartColumn", -129547140);
        setIntField(term75765, term75765.getClass(), "categoryEndColumn", 199287428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryEndRow", argTypes, term75765, args);
    }

};


