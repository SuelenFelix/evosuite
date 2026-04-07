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

public class FileUtils_listAllFilesWithTimeCost_111602596210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2435;

    public FileUtils_listAllFilesWithTimeCost_111602596210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2471 = Class.forName((String) "java.io.File$PathStatus");
        Field term2470 = ((Class) term2471).getDeclaredField((String) "INVALID");
        ((Field) term2470).setAccessible(true);
        Object enum12 = ((Field) term2470).get((Object) null);
        term2435 = newInstance(Class.forName("java.io.File"));
        setField(term2435, term2435.getClass(), "path", "BYqFIqCKAV");
        setField(term2435, term2435.getClass(), "status", enum12);
        setIntField(term2435, term2435.getClass(), "prefixLength", 1585847225);
        setField(term2435, term2435.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2435;
        callMethod(klass, "listAllFilesWithTimeCost", argTypes, null, args);
    }

};


