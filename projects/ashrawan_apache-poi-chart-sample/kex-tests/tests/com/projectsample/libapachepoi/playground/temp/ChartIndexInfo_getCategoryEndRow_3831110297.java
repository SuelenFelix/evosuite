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

public class ChartIndexInfo_getCategoryEndRow_3831110297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55;

    public ChartIndexInfo_getCategoryEndRow_3831110297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term55, term55.getClass(), "dataStartRow", 1962444399);
        setIntField(term55, term55.getClass(), "dataEndRow", 767834723);
        setIntField(term55, term55.getClass(), "dataStartColumn", -602026508);
        setIntField(term55, term55.getClass(), "dataEndColumn", -157887805);
        setIntField(term55, term55.getClass(), "categoryStartRow", 1876565163);
        setIntField(term55, term55.getClass(), "categoryEndRow", -817164822);
        setIntField(term55, term55.getClass(), "categoryStartColumn", -1016503459);
        setIntField(term55, term55.getClass(), "categoryEndColumn", -1968847291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryEndRow", argTypes, term55, args);
    }

};


