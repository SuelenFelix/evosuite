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

public class FileUtils_listAllFiles_20576032869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2257;

    public FileUtils_listAllFiles_20576032869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2293 = Class.forName((String) "java.io.File$PathStatus");
        Field term2292 = ((Class) term2293).getDeclaredField((String) "CHECKED");
        ((Field) term2292).setAccessible(true);
        Object enum11 = ((Field) term2292).get((Object) null);
        term2257 = newInstance(Class.forName("java.io.File"));
        setField(term2257, term2257.getClass(), "path", "eZFUvlxvGV");
        setField(term2257, term2257.getClass(), "status", enum11);
        setIntField(term2257, term2257.getClass(), "prefixLength", -883034806);
        setField(term2257, term2257.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2257;
        callMethod(klass, "listAllFiles", argTypes, null, args);
    }

};


