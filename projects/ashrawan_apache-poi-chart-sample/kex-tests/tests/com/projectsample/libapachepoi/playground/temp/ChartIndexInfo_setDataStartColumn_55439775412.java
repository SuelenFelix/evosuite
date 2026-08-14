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

public class ChartIndexInfo_setDataStartColumn_55439775412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term113;

    public ChartIndexInfo_setDataStartColumn_55439775412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term104, term104.getClass(), "dataStartRow", -481533957);
        setIntField(term104, term104.getClass(), "dataEndRow", 1240914516);
        setIntField(term104, term104.getClass(), "dataStartColumn", -1465035361);
        setIntField(term104, term104.getClass(), "dataEndColumn", 1090617576);
        setIntField(term104, term104.getClass(), "categoryStartRow", -1547384488);
        setIntField(term104, term104.getClass(), "categoryEndRow", 1442160736);
        setIntField(term104, term104.getClass(), "categoryStartColumn", 1114000454);
        setIntField(term104, term104.getClass(), "categoryEndColumn", -556405712);
        term113 = new Integer(-1772434990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term113;
        callMethod(klass, "setDataStartColumn", argTypes, term104, args);
    }

};


