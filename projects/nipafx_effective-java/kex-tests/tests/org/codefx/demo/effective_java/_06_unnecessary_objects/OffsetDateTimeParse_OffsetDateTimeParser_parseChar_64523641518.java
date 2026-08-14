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
import java.lang.Character;

public class OffsetDateTimeParse_OffsetDateTimeParser_parseChar_64523641518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329;
     Object term330;

    public OffsetDateTimeParse_OffsetDateTimeParser_parseChar_64523641518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term329 = newInstance(Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser"));
        term330 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term330;
        callMethod(klass, "parseChar", argTypes, term329, args);
    }

};


