package com.leosam.tvbox.mv.utils;

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
import static com.leosam.tvbox.mv.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ClassPathReaderUtils_deleteAllFile_13560678323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1419;

    public ClassPathReaderUtils_deleteAllFile_13560678323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1477 = Class.forName((String) "java.io.File$PathStatus");
        Field term1476 = ((Class) term1477).getDeclaredField((String) "INVALID");
        ((Field) term1476).setAccessible(true);
        Object enum0 = ((Field) term1476).get((Object) null);
        term1419 = newInstance(Class.forName("java.io.File"));
        setField(term1419, term1419.getClass(), "path", "LvtrsXUliU");
        setField(term1419, term1419.getClass(), "status", enum0);
        setIntField(term1419, term1419.getClass(), "prefixLength", 1048535127);
        setField(term1419, term1419.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.leosam.tvbox.mv.utils.ClassPathReaderUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1419;
        callMethod(klass, "deleteAllFile", argTypes, null, args);
    }

};


