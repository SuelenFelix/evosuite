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

public class ChartIndexInfo_setDataEndColumn_113083409912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75825;
     Object term75834;

    public ChartIndexInfo_setDataEndColumn_113083409912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75825 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75825, term75825.getClass(), "dataStartRow", -1694747156);
        setIntField(term75825, term75825.getClass(), "dataEndRow", 1466373988);
        setIntField(term75825, term75825.getClass(), "dataStartColumn", -358526505);
        setIntField(term75825, term75825.getClass(), "dataEndColumn", 1843268026);
        setIntField(term75825, term75825.getClass(), "categoryStartRow", 954660603);
        setIntField(term75825, term75825.getClass(), "categoryEndRow", -1351605385);
        setIntField(term75825, term75825.getClass(), "categoryStartColumn", 278355793);
        setIntField(term75825, term75825.getClass(), "categoryEndColumn", -310648604);
        term75834 = new Integer(-648200466);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term75834;
        callMethod(klass, "setDataEndColumn", argTypes, term75825, args);
    }

};


