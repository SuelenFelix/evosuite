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

public class FileExportManager_getLiveDanMuDir_14778581244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;

    public FileExportManager_getLiveDanMuDir_14778581244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2248 = Class.forName((String) "java.io.File$PathStatus");
        Field term2247 = ((Class) term2248).getDeclaredField((String) "CHECKED");
        ((Field) term2247).setAccessible(true);
        Object enum7 = ((Field) term2247).get((Object) null);
        term2199 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        Object term2200 = newInstance(Class.forName("java.io.File"));
        setField(term2199, term2199.getClass(), "logger", null);
        setField(term2200, term2200.getClass(), "path", "NRdvgJlhkX");
        setField(term2200, term2200.getClass(), "status", enum7);
        setIntField(term2200, term2200.getClass(), "prefixLength", -616727354);
        setField(term2200, term2200.getClass(), "filePath", null);
        setField(term2199, term2199.getClass(), "exportDir", term2200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uuaPigETmJ";
        callMethod(klass, "getLiveDanMuDir", argTypes, term2199, args);
    }

};


