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

public class ChartIndexInfo_getCategoryStartColumn_5534394847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75774;

    public ChartIndexInfo_getCategoryStartColumn_5534394847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75774 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75774, term75774.getClass(), "dataStartRow", -1195339592);
        setIntField(term75774, term75774.getClass(), "dataEndRow", -376422566);
        setIntField(term75774, term75774.getClass(), "dataStartColumn", 306847454);
        setIntField(term75774, term75774.getClass(), "dataEndColumn", 1745276158);
        setIntField(term75774, term75774.getClass(), "categoryStartRow", 2009020256);
        setIntField(term75774, term75774.getClass(), "categoryEndRow", 2049577015);
        setIntField(term75774, term75774.getClass(), "categoryStartColumn", 1236004505);
        setIntField(term75774, term75774.getClass(), "categoryEndColumn", 1050765721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryStartColumn", argTypes, term75774, args);
    }

};


