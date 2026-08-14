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
import java.lang.Object;
import java.lang.String;

public class FileExportManager_checkPath_4850347503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2020;

    public FileExportManager_checkPath_4850347503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2057 = Class.forName((String) "java.io.File$PathStatus");
        Field term2056 = ((Class) term2057).getDeclaredField((String) "INVALID");
        ((Field) term2056).setAccessible(true);
        Object enum6 = ((Field) term2056).get((Object) null);
        term2020 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        Object term2021 = newInstance(Class.forName("java.io.File"));
        setField(term2020, term2020.getClass(), "logger", null);
        setField(term2021, term2021.getClass(), "path", "MjGYSRKTNF");
        setField(term2021, term2021.getClass(), "status", enum6);
        setIntField(term2021, term2021.getClass(), "prefixLength", 1484323161);
        setField(term2021, term2021.getClass(), "filePath", null);
        setField(term2020, term2020.getClass(), "exportDir", term2021);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkPath", argTypes, term2020, args);
    }

};


