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

public class FileUtils_removeDir_6409938356 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1367;

    public FileUtils_removeDir_6409938356() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1403 = Class.forName((String) "java.io.File$PathStatus");
        Field term1402 = ((Class) term1403).getDeclaredField((String) "INVALID");
        ((Field) term1402).setAccessible(true);
        Object enum6 = ((Field) term1402).get((Object) null);
        term1367 = newInstance(Class.forName("java.io.File"));
        setField(term1367, term1367.getClass(), "path", "HyxfbSQYBe");
        setField(term1367, term1367.getClass(), "status", enum6);
        setIntField(term1367, term1367.getClass(), "prefixLength", 1227103734);
        setField(term1367, term1367.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1367;
        callMethod(klass, "removeDir", argTypes, null, args);
    }

};


