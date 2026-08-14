package com.github.cuteluobo.livedanmuarchive.pojo;

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
import static com.github.cuteluobo.livedanmuarchive.pojo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FormatDanMuData_setStartTime_12800750763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23366;
     Object term23381;

    public FormatDanMuData_setStartTime_12800750763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23366 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData"));
        setLongField(term23366, term23366.getClass(), "startTime", 7717843551775677202L);
        setField(term23366, term23366.getClass(), "content", "HZODpafOGe");
        setFloatField(term23366, term23366.getClass(), "fontSize", 0.3455959F);
        term23381 = new Long(2823262561274956150L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.pojo.FormatDanMuData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term23381;
        callMethod(klass, "setStartTime", argTypes, term23366, args);
    }

};


