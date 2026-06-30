package com.zxl.dailypractice.java.practice.io;

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
import static com.zxl.dailypractice.java.practice.io.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Io_listAllFiles_14527498691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92;

    public Io_listAllFiles_14527498691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150 = Class.forName((String) "java.io.File$PathStatus");
        Field term149 = ((Class) term150).getDeclaredField((String) "INVALID");
        ((Field) term149).setAccessible(true);
        Object enum0 = ((Field) term149).get((Object) null);
        term92 = newInstance(Class.forName("java.io.File"));
        setField(term92, term92.getClass(), "path", "jJCZpVmanW");
        setField(term92, term92.getClass(), "status", enum0);
        setIntField(term92, term92.getClass(), "prefixLength", 568599855);
        setField(term92, term92.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.zxl.dailypractice.java.practice.io.Io");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term92;
        callMethod(klass, "listAllFiles", argTypes, null, args);
    }

};


