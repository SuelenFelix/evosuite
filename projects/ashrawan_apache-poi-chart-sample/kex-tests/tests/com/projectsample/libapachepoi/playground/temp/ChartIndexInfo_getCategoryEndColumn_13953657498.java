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

public class ChartIndexInfo_getCategoryEndColumn_13953657498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75783;

    public ChartIndexInfo_getCategoryEndColumn_13953657498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75783 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75783, term75783.getClass(), "dataStartRow", 474518942);
        setIntField(term75783, term75783.getClass(), "dataEndRow", -1656687479);
        setIntField(term75783, term75783.getClass(), "dataStartColumn", -249614216);
        setIntField(term75783, term75783.getClass(), "dataEndColumn", 1870727665);
        setIntField(term75783, term75783.getClass(), "categoryStartRow", -519881101);
        setIntField(term75783, term75783.getClass(), "categoryEndRow", -680920524);
        setIntField(term75783, term75783.getClass(), "categoryStartColumn", -916335264);
        setIntField(term75783, term75783.getClass(), "categoryEndColumn", -919416536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryEndColumn", argTypes, term75783, args);
    }

};


