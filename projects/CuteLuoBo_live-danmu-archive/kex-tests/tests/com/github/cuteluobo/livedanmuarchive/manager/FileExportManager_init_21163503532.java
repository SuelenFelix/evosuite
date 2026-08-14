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

public class FileExportManager_init_21163503532 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1842;

    public FileExportManager_init_21163503532() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1878 = Class.forName((String) "java.io.File$PathStatus");
        Field term1877 = ((Class) term1878).getDeclaredField((String) "INVALID");
        ((Field) term1877).setAccessible(true);
        Object enum5 = ((Field) term1877).get((Object) null);
        term1842 = newInstance(Class.forName("java.io.File"));
        setField(term1842, term1842.getClass(), "path", "SzjVpOQTyS");
        setField(term1842, term1842.getClass(), "status", enum5);
        setIntField(term1842, term1842.getClass(), "prefixLength", 1162663216);
        setField(term1842, term1842.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term1842;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


