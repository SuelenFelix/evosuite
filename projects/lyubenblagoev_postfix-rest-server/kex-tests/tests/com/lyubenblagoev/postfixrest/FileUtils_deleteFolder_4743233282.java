package com.lyubenblagoev.postfixrest;

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
import static com.lyubenblagoev.postfixrest.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FileUtils_deleteFolder_4743233282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9938;

    public FileUtils_deleteFolder_4743233282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9986 = Class.forName((String) "java.io.File$PathStatus");
        Field term9985 = ((Class) term9986).getDeclaredField((String) "INVALID");
        ((Field) term9985).setAccessible(true);
        Object enum1 = ((Field) term9985).get((Object) null);
        term9938 = newInstance(Class.forName("java.io.File"));
        setField(term9938, term9938.getClass(), "path", "dEnhdmILtU");
        setField(term9938, term9938.getClass(), "status", enum1);
        setIntField(term9938, term9938.getClass(), "prefixLength", 1162663216);
        setField(term9938, term9938.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.FileUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term9938;
        args[1] = "hoicvmsovO";
        callMethod(klass, "deleteFolder", argTypes, null, args);
    }

};


