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

public class FileUtils_move_18962715712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679;
     Object term704;

    public FileUtils_move_18962715712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term729 = Class.forName((String) "java.io.File$PathStatus");
        Field term728 = ((Class) term729).getDeclaredField((String) "CHECKED");
        ((Field) term728).setAccessible(true);
        Object enum3 = ((Field) term728).get((Object) null);
        term679 = newInstance(Class.forName("java.io.File"));
        setField(term679, term679.getClass(), "path", "hRNSzYYIrc");
        setField(term679, term679.getClass(), "status", enum3);
        setIntField(term679, term679.getClass(), "prefixLength", -1922583790);
        setField(term679, term679.getClass(), "filePath", null);
        term704 = newInstance(Class.forName("java.io.File"));
        setField(term704, term704.getClass(), "path", "RMFIsYGgne");
        setField(term704, term704.getClass(), "status", enum3);
        setIntField(term704, term704.getClass(), "prefixLength", -616727354);
        setField(term704, term704.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.gin.mergegfassets.utils.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.io.File");
        Object[] args = new Object[2];
        args[0] = term679;
        args[1] = term704;
        callMethod(klass, "move", argTypes, null, args);
    }

};


