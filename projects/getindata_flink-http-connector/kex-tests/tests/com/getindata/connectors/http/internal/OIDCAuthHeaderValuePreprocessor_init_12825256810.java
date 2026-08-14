package com.getindata.connectors.http.internal;

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
import static com.getindata.connectors.http.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OIDCAuthHeaderValuePreprocessor_init_12825256810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16998;

    public OIDCAuthHeaderValuePreprocessor_init_12825256810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16998 = newInstance(Class.forName("java.util.Optional"));
        Object term16999 = newInstance(Class.forName("java.time.Duration"));
        setLongField(term16999, term16999.getClass(), "seconds", 46800L);
        setIntField(term16999, term16999.getClass(), "nanos", 0);
        setField(term16998, term16998.getClass(), "value", term16999);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.getindata.connectors.http.internal.OIDCAuthHeaderValuePreprocessor");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.Optional");
        Object[] args = new Object[3];
        args[0] = "XYtryyobou";
        args[1] = "OYbzXylRWW";
        args[2] = term16998;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


