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

public class FileExportManager_checkDbFileList_6084374955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2400;
     Object term2426;

    public FileExportManager_checkDbFileList_6084374955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2451 = Class.forName((String) "java.io.File$PathStatus");
        Field term2450 = ((Class) term2451).getDeclaredField((String) "CHECKED");
        ((Field) term2450).setAccessible(true);
        Object enum8 = ((Field) term2450).get((Object) null);
        term2400 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        Object term2401 = newInstance(Class.forName("java.io.File"));
        setField(term2400, term2400.getClass(), "logger", null);
        setField(term2401, term2401.getClass(), "path", "MxlszYVzRf");
        setField(term2401, term2401.getClass(), "status", enum8);
        setIntField(term2401, term2401.getClass(), "prefixLength", -1955890973);
        setField(term2401, term2401.getClass(), "filePath", null);
        setField(term2400, term2400.getClass(), "exportDir", term2401);
        term2426 = newInstance(Class.forName("java.io.File"));
        setField(term2426, term2426.getClass(), "path", "LQFpaHEwXR");
        setField(term2426, term2426.getClass(), "status", enum8);
        setIntField(term2426, term2426.getClass(), "prefixLength", -2038273078);
        setField(term2426, term2426.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2426;
        callMethod(klass, "checkDbFileList", argTypes, term2400, args);
    }

};


