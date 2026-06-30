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

public class FileUtils_renameFolder_16106526821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9694;

    public FileUtils_renameFolder_16106526821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9776 = Class.forName((String) "java.io.File$PathStatus");
        Field term9775 = ((Class) term9776).getDeclaredField((String) "INVALID");
        ((Field) term9775).setAccessible(true);
        Object enum0 = ((Field) term9775).get((Object) null);
        term9694 = newInstance(Class.forName("java.io.File"));
        setField(term9694, term9694.getClass(), "path", "ytSBIKXogI");
        setField(term9694, term9694.getClass(), "status", enum0);
        setIntField(term9694, term9694.getClass(), "prefixLength", 568599855);
        setField(term9694, term9694.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.FileUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.File");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term9694;
        args[1] = "nHXjMycHlU";
        args[2] = "ieCtQFdkii";
        callMethod(klass, "renameFolder", argTypes, null, args);
    }

};


