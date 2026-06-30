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
import java.lang.Integer;

public class ChartIndexInfo_setCategoryEndRow_192321163535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326;
     Object term335;

    public ChartIndexInfo_setCategoryEndRow_192321163535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term326 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term326, term326.getClass(), "dataStartRow", 0);
        setIntField(term326, term326.getClass(), "dataEndRow", 0);
        setIntField(term326, term326.getClass(), "dataStartColumn", 0);
        setIntField(term326, term326.getClass(), "dataEndColumn", 0);
        setIntField(term326, term326.getClass(), "categoryStartRow", 0);
        setIntField(term326, term326.getClass(), "categoryEndRow", 0);
        setIntField(term326, term326.getClass(), "categoryStartColumn", 0);
        setIntField(term326, term326.getClass(), "categoryEndColumn", 0);
        term335 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term335;
        callMethod(klass, "setCategoryEndRow", argTypes, term326, args);
    }

};


