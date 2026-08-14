package com.creativityfactory.swiftserver.utils;

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
import static com.creativityfactory.swiftserver.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IOUtils_fromBufferToString_8912626035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;

    public IOUtils_fromBufferToString_8912626035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("com.creativityfactory.swiftserver.utils.IOUtils"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.creativityfactory.swiftserver.utils.IOUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.BufferedReader");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "fromBufferToString", argTypes, term285, args);
    }

};


