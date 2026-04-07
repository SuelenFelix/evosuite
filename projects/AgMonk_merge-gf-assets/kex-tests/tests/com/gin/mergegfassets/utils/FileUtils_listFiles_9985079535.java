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

public class FileUtils_listFiles_9985079535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1189;

    public FileUtils_listFiles_9985079535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1225 = Class.forName((String) "java.io.File$PathStatus");
        Field term1224 = ((Class) term1225).getDeclaredField((String) "CHECKED");
        ((Field) term1224).setAccessible(true);
        Object enum5 = ((Field) term1224).get((Object) null);
        term1189 = newInstance(Class.forName("java.io.File"));
        setField(term1189, term1189.getClass(), "path", "tbcdzjIfER");
        setField(term1189, term1189.getClass(), "status", enum5);
        setIntField(term1189, term1189.getClass(), "prefixLength", -2038273078);
        setField(term1189, term1189.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1189;
        callMethod(klass, "listFiles", argTypes, null, args);
    }

};


