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

public class FileUtils_copyFile_16699375558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1901;
     Object term1926;

    public FileUtils_copyFile_16699375558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1962 = Class.forName((String) "java.io.File$PathStatus");
        Field term1961 = ((Class) term1962).getDeclaredField((String) "CHECKED");
        ((Field) term1961).setAccessible(true);
        Object enum9 = ((Field) term1961).get((Object) null);
        term1901 = newInstance(Class.forName("java.io.File"));
        setField(term1901, term1901.getClass(), "path", "RkybSrpybU");
        setField(term1901, term1901.getClass(), "status", enum9);
        setIntField(term1901, term1901.getClass(), "prefixLength", -522618178);
        setField(term1901, term1901.getClass(), "filePath", null);
        Class<? extends Object> term2115 = Class.forName((String) "java.io.File$PathStatus");
        Field term2114 = ((Class) term2115).getDeclaredField((String) "INVALID");
        ((Field) term2114).setAccessible(true);
        Object enum10 = ((Field) term2114).get((Object) null);
        term1926 = newInstance(Class.forName("java.io.File"));
        setField(term1926, term1926.getClass(), "path", "xOEqzGAmDU");
        setField(term1926, term1926.getClass(), "status", enum10);
        setIntField(term1926, term1926.getClass(), "prefixLength", 1134449235);
        setField(term1926, term1926.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term1901;
        args[1] = term1926;
        callMethod(klass, "copyFile", argTypes, null, args);
    }

};


