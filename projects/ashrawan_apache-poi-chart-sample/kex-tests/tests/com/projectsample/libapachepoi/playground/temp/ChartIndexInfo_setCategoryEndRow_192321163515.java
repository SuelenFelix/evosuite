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

public class ChartIndexInfo_setCategoryEndRow_192321163515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term146;

    public ChartIndexInfo_setCategoryEndRow_192321163515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term137, term137.getClass(), "dataStartRow", -1476117762);
        setIntField(term137, term137.getClass(), "dataEndRow", -341962980);
        setIntField(term137, term137.getClass(), "dataStartColumn", 1532716628);
        setIntField(term137, term137.getClass(), "dataEndColumn", -1801760683);
        setIntField(term137, term137.getClass(), "categoryStartRow", 1141317871);
        setIntField(term137, term137.getClass(), "categoryEndRow", 890669485);
        setIntField(term137, term137.getClass(), "categoryStartColumn", 691577392);
        setIntField(term137, term137.getClass(), "categoryEndColumn", -893623680);
        term146 = new Integer(-1963434938);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term146;
        callMethod(klass, "setCategoryEndRow", argTypes, term137, args);
    }

};


