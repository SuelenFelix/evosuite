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

public class FileExportManager_getInstance_5868556389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3140;

    public FileExportManager_getInstance_5868556389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3140 = newInstance(Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager"));
        setField(term3140, term3140.getClass(), "logger", null);
        setField(term3140, term3140.getClass(), "exportDir", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.github.cuteluobo.livedanmuarchive.manager.FileExportManager");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstance", argTypes, term3140, args);
    }

};


