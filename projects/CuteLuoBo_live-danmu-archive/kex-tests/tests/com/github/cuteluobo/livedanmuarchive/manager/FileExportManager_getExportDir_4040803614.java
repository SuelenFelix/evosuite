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

public class FileExportManager_getExportDir_4040803614 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3144;

    public FileExportManager_getExportDir_4040803614() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3144 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        setField(term3144, term3144.getClass(), "logger", null);
        setField(term3144, term3144.getClass(), "exportDir", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExportDir", argTypes, term3144, args);
    }

};


