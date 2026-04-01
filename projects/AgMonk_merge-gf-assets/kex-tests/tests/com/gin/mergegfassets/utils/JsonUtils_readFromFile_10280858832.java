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

public class JsonUtils_readFromFile_10280858832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273;

    public JsonUtils_readFromFile_10280858832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term309 = Class.forName((String) "java.io.File$PathStatus");
        Field term308 = ((Class) term309).getDeclaredField((String) "INVALID");
        ((Field) term308).setAccessible(true);
        Object enum1 = ((Field) term308).get((Object) null);
        term273 = newInstance(Class.forName("java.io.File"));
        setField(term273, term273.getClass(), "path", "jJCZpVmanW");
        setField(term273, term273.getClass(), "status", enum1);
        setIntField(term273, term273.getClass(), "prefixLength", 1162663216);
        setField(term273, term273.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.JsonUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term273;
        callMethod(klass, "readFromFile", argTypes, null, args);
    }

};


