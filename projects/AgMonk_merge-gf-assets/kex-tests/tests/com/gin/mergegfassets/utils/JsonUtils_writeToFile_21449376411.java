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

public class JsonUtils_writeToFile_21449376411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term97;

    public JsonUtils_writeToFile_21449376411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term131 = Class.forName((String) "java.io.File$PathStatus");
        Field term130 = ((Class) term131).getDeclaredField((String) "INVALID");
        ((Field) term130).setAccessible(true);
        Object enum0 = ((Field) term130).get((Object) null);
        term72 = newInstance(Class.forName("java.io.File"));
        setField(term72, term72.getClass(), "path", "xxtlPwDYFs");
        setField(term72, term72.getClass(), "status", enum0);
        setIntField(term72, term72.getClass(), "prefixLength", 568599855);
        setField(term72, term72.getClass(), "filePath", null);
        term97 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.JsonUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term72;
        args[1] = term97;
        callMethod(klass, "writeToFile", argTypes, null, args);
    }

};


