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

public class FileExportManager_getExportDir_404080366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2603;

    public FileExportManager_getExportDir_404080366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2640 = Class.forName((String) "java.io.File$PathStatus");
        Field term2639 = ((Class) term2640).getDeclaredField((String) "INVALID");
        ((Field) term2639).setAccessible(true);
        Object enum9 = ((Field) term2639).get((Object) null);
        term2603 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        Object term2604 = newInstance(Class.forName("java.io.File"));
        setField(term2603, term2603.getClass(), "logger", null);
        setField(term2604, term2604.getClass(), "path", "oVcInYnLWB");
        setField(term2604, term2604.getClass(), "status", enum9);
        setIntField(term2604, term2604.getClass(), "prefixLength", 1227103734);
        setField(term2604, term2604.getClass(), "filePath", null);
        setField(term2603, term2603.getClass(), "exportDir", term2604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExportDir", argTypes, term2603, args);
    }

};


