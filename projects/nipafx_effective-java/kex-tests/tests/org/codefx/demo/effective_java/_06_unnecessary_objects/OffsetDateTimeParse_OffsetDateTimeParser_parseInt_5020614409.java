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
import java.lang.Integer;

public class OffsetDateTimeParse_OffsetDateTimeParser_parseInt_5020614409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303;
     Object term306;

    public OffsetDateTimeParse_OffsetDateTimeParser_parseInt_5020614409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303 = (int[]) newIntArray(2);
        setIntElement(term303, 0, -117576464);
        setIntElement(term303, 1, -1007160944);
        term306 = new Integer(1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = "RMFIsYGgne";
        args[1] = term303;
        args[2] = term306;
        callMethod(klass, "parseInt", argTypes, null, args);
    }

};


