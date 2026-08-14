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

public class ChartIndexInfo_setCategoryStartRow_129718082613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75836;
     Object term75845;

    public ChartIndexInfo_setCategoryStartRow_129718082613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75836 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75836, term75836.getClass(), "dataStartRow", 2007134147);
        setIntField(term75836, term75836.getClass(), "dataEndRow", 993388358);
        setIntField(term75836, term75836.getClass(), "dataStartColumn", -765191335);
        setIntField(term75836, term75836.getClass(), "dataEndColumn", -1697741155);
        setIntField(term75836, term75836.getClass(), "categoryStartRow", 1295839803);
        setIntField(term75836, term75836.getClass(), "categoryEndRow", -1891015523);
        setIntField(term75836, term75836.getClass(), "categoryStartColumn", -1560631747);
        setIntField(term75836, term75836.getClass(), "categoryEndColumn", 1215150180);
        term75845 = new Integer(-1422859977);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75845;
        callMethod(klass, "setCategoryStartRow", argTypes, term75836, args);
    }

};


