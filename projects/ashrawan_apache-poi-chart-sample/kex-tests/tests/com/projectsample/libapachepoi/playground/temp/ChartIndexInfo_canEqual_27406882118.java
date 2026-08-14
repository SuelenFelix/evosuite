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

public class ChartIndexInfo_canEqual_27406882118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75890;
     Object term75899;

    public ChartIndexInfo_canEqual_27406882118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75890 = newInstance(Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo"));
        setIntField(term75890, term75890.getClass(), "dataStartRow", 1242676024);
        setIntField(term75890, term75890.getClass(), "dataEndRow", -1865023308);
        setIntField(term75890, term75890.getClass(), "dataStartColumn", 1698510819);
        setIntField(term75890, term75890.getClass(), "dataEndColumn", -1553893255);
        setIntField(term75890, term75890.getClass(), "categoryStartRow", 1303442927);
        setIntField(term75890, term75890.getClass(), "categoryEndRow", 794568325);
        setIntField(term75890, term75890.getClass(), "categoryStartColumn", -434468428);
        setIntField(term75890, term75890.getClass(), "categoryEndColumn", 1559605714);
        term75899 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.projectsample.libapachepoi.playground.temp.ChartIndexInfo");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75899;
        callMethod(klass, "canEqual", argTypes, term75890, args);
    }

};


