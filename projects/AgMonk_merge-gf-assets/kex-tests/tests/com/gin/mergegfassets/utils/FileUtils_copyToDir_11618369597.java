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

public class FileUtils_copyToDir_11618369597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1545;
     Object term1570;

    public FileUtils_copyToDir_11618369597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1606 = Class.forName((String) "java.io.File$PathStatus");
        Field term1605 = ((Class) term1606).getDeclaredField((String) "CHECKED");
        ((Field) term1605).setAccessible(true);
        Object enum7 = ((Field) term1605).get((Object) null);
        term1545 = newInstance(Class.forName("java.io.File"));
        setField(term1545, term1545.getClass(), "path", "pCTimMblYc");
        setField(term1545, term1545.getClass(), "status", enum7);
        setIntField(term1545, term1545.getClass(), "prefixLength", -1339778481);
        setField(term1545, term1545.getClass(), "filePath", null);
        Class<? extends Object> term1759 = Class.forName((String) "java.io.File$PathStatus");
        Field term1758 = ((Class) term1759).getDeclaredField((String) "INVALID");
        ((Field) term1758).setAccessible(true);
        Object enum8 = ((Field) term1758).get((Object) null);
        term1570 = newInstance(Class.forName("java.io.File"));
        setField(term1570, term1570.getClass(), "path", "hNxWaHcfhY");
        setField(term1570, term1570.getClass(), "status", enum8);
        setIntField(term1570, term1570.getClass(), "prefixLength", 1725571209);
        setField(term1570, term1570.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term1545;
        args[1] = term1570;
        callMethod(klass, "copyToDir", argTypes, null, args);
    }

};


