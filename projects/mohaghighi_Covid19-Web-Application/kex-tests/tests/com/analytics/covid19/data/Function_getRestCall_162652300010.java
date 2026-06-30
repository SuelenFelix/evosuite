package com.analytics.covid19.data;

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
import static com.analytics.covid19.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Function_getRestCall_162652300010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3822;

    public Function_getRestCall_162652300010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3822 = newInstance(Class.forName("com.analytics.covid19.data.Function"));
        setIntField(term3822, term3822.getClass(), "id", 0);
        setField(term3822, term3822.getClass(), "instruction", null);
        setField(term3822, term3822.getClass(), "restCall", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.analytics.covid19.data.Function");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRestCall", argTypes, term3822, args);
    }

};


