package com.github.cuteluobo.livedanmuarchive.manager;

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
import static com.github.cuteluobo.livedanmuarchive.manager.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FileExportManager_getInstance_7579269560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1642;

    public FileExportManager_getInstance_7579269560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1700 = Class.forName((String) "java.io.File$PathStatus");
        Field term1699 = ((Class) term1700).getDeclaredField((String) "INVALID");
        ((Field) term1699).setAccessible(true);
        Object enum4 = ((Field) term1699).get((Object) null);
        term1642 = newInstance(Class.forName("java.io.File"));
        setField(term1642, term1642.getClass(), "path", "EGtDIRbSSb");
        setField(term1642, term1642.getClass(), "status", enum4);
        setIntField(term1642, term1642.getClass(), "prefixLength", 568599855);
        setField(term1642, term1642.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1642;
        callMethod(klass, "getInstance", argTypes, null, args);
    }

};


