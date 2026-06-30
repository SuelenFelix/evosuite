package com.gin.mergegfassets.utils;

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
import static com.gin.mergegfassets.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FileUtils_moveToDir_19158993311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;
     Object term502;

    public FileUtils_moveToDir_19158993311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term527 = Class.forName((String) "java.io.File$PathStatus");
        Field term526 = ((Class) term527).getDeclaredField((String) "INVALID");
        ((Field) term526).setAccessible(true);
        Object enum2 = ((Field) term526).get((Object) null);
        term477 = newInstance(Class.forName("java.io.File"));
        setField(term477, term477.getClass(), "path", "SzjVpOQTyS");
        setField(term477, term477.getClass(), "status", enum2);
        setIntField(term477, term477.getClass(), "prefixLength", 1484323161);
        setField(term477, term477.getClass(), "filePath", null);
        term502 = newInstance(Class.forName("java.io.File"));
        setField(term502, term502.getClass(), "path", "MjGYSRKTNF");
        setField(term502, term502.getClass(), "status", enum2);
        setIntField(term502, term502.getClass(), "prefixLength", 391863371);
        setField(term502, term502.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term477;
        args[1] = term502;
        callMethod(klass, "moveToDir", argTypes, null, args);
    }

};


