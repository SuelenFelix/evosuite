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

public class BomCharset_writeBomBytes_199523605410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574;

    public BomCharset_writeBomBytes_199523605410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574 = newInstance(Class.forName("com.coreoz.windmill.files.BomCharset"));
        setField(term574, term574.getClass(), "charset", null);
        setField(term574, term574.getClass(), "bomBytes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.coreoz.windmill.files.BomCharset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "writeBomBytes", argTypes, term574, args);
    }

};


