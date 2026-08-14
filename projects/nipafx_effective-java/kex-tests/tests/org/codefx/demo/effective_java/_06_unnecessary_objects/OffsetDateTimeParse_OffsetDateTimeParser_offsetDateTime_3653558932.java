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

public class OffsetDateTimeParse_OffsetDateTimeParser_offsetDateTime_3653558932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public OffsetDateTimeParse_OffsetDateTimeParser_offsetDateTime_3653558932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.codefx.demo.effective_java._06_unnecessary_objects.OffsetDateTimeParse$OffsetDateTimeParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "offsetDateTime", argTypes, null, args);
    }

};


