package com.coreoz.windmill.files;

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
import static com.coreoz.windmill.files.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BomCharset_detectCharset_16073256569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573;

    public BomCharset_detectCharset_16073256569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term573 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        setField(term573, term573.getClass(), "charset", null);
        setField(term573, term573.getClass(), "bomBytes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.BomCharset");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = Class.forName("com.coreoz.windmill.files.BomCharset");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "detectCharset", argTypes, term573, args);
    }

};


