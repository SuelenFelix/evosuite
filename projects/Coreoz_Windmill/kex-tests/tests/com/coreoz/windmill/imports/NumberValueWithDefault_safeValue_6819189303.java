package com.coreoz.windmill.imports;

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
import static com.coreoz.windmill.imports.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class NumberValueWithDefault_safeValue_6819189303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;

    public NumberValueWithDefault_safeValue_6819189303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("com.coreoz.windmill.imports.NumberValueWithDefault"));
        setField(term104, term104.getClass(), "value", null);
        setField(term104, term104.getClass(), "stringValue", "jJCZpVmanW");
        setField(term104, term104.getClass(), "valueParser", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.imports.NumberValueWithDefault");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "safeValue", argTypes, term104, args);
    }

};


