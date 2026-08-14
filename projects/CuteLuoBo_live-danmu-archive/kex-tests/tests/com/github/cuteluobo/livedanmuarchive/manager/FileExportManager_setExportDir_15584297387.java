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

public class FileExportManager_setExportDir_15584297387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2782;
     Object term2808;

    public FileExportManager_setExportDir_15584297387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2844 = Class.forName((String) "java.io.File$PathStatus");
        Field term2843 = ((Class) term2844).getDeclaredField((String) "CHECKED");
        ((Field) term2843).setAccessible(true);
        Object enum10 = ((Field) term2843).get((Object) null);
        term2782 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        Object term2783 = newInstance(Class.forName("java.io.File"));
        setField(term2782, term2782.getClass(), "logger", null);
        setField(term2783, term2783.getClass(), "path", "aJlieCFVtF");
        setField(term2783, term2783.getClass(), "status", enum10);
        setIntField(term2783, term2783.getClass(), "prefixLength", -1339778481);
        setField(term2783, term2783.getClass(), "filePath", null);
        setField(term2782, term2782.getClass(), "exportDir", term2783);
        Class<? extends Object> term2997 = Class.forName((String) "java.io.File$PathStatus");
        Field term2996 = ((Class) term2997).getDeclaredField((String) "INVALID");
        ((Field) term2996).setAccessible(true);
        Object enum11 = ((Field) term2996).get((Object) null);
        term2808 = newInstance(Class.forName("java.io.File"));
        setField(term2808, term2808.getClass(), "path", "ZiaGIbnzTs");
        setField(term2808, term2808.getClass(), "status", enum11);
        setIntField(term2808, term2808.getClass(), "prefixLength", 1725571209);
        setField(term2808, term2808.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term2808;
        callMethod(klass, "setExportDir", argTypes, term2782, args);
    }

};


