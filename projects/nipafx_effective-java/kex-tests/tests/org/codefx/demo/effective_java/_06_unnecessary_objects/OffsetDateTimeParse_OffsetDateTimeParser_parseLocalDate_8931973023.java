package org.codefx.demo.effective_java._06_unnecessary_objects;

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
import static org.codefx.demo.effective_java._06_unnecessary_objects.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OffsetDateTimeParse_OffsetDateTimeParser_parseLocalDate_8931973023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;

    public OffsetDateTimeParse_OffsetDateTimeParser_parseLocalDate_8931973023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = (int[]) newIntArray(5);
        setIntElement(term93, 0, 568599855);
        setIntElement(term93, 1, 1162663216);
        setIntElement(term93, 2, 1484323161);
        setIntElement(term93, 3, 391863371);
        setIntElement(term93, 4, -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term93;
        callMethod(klass, "parseLocalDate", argTypes, null, args);
    }

};


